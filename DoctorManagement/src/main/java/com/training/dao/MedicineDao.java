package com.training.dao;

import com.training.ifaces.MyRepository;
import com.training.entity.Medicine;
import lombok.Getter;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter

public class MedicineDao implements MyRepository<Medicine> {


    private static String tableName="JPMedicine";
    Connection con=null;
    PreparedStatement pstmt= null;

    public MedicineDao(){
        try {
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","harshad_t","letmein19");
            //DB connection established here.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Add a record, connect to DB and run insert SQL.
    @Override
    public int add(Medicine medicine) {
        String sql="insert into "+tableName+" values(?,?,?,?)";

        int rowAdded=0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1,medicine.getCodeNumber());
            pstmt.setString(2,medicine.getMedicineName());
            pstmt.setDouble(3,medicine.getRateperUnit());
            pstmt.setString(4,medicine.getType());
            rowAdded=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Details added :"
                + medicine.getCodeNumber() + " " + medicine.getMedicineName()
                + " " + medicine.getType() + " " + medicine.getRateperUnit()
        );
        return rowAdded;
    }

    //Connect to DB and retrieve all records.
    @Override
    public List<Map<Long,Medicine>> findAll() {
        String sql="select * from "+tableName;

        List<Map<Long,Medicine>> medicineList = new ArrayList <Map<Long,Medicine>>();
        Map<Long,Medicine> medicineMap = new HashMap<>();

        try {
            pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                medicineMap.put(rs.getLong(1),
                                new Medicine(rs.getLong(1),
                                             rs.getString(2),
                                             rs.getDouble(3),
                                             rs.getString(4))
                        );
            }
            medicineList.add(medicineMap);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicineList;
    }

    //Connect to DB and retrieve a medicine record for a particular medicine code.
    @Override
    public Medicine findById(long key) {
        String sql="select * from "+tableName+" where code=?";
        Medicine rowmedicineFound = null;

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1,key);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                rowmedicineFound = new Medicine(rs.getLong(1),rs.getString(2),rs.getDouble(3),rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowmedicineFound;
    }

    //Update medicine record.
    @Override
    public int update(Medicine medicine) {
        String sql="update "+tableName+ " set medicine_Name=? , rate_Per_Unit=?, type=? where code=?";

        int rowUpdated=0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,medicine.getMedicineName());
            pstmt.setDouble(2,medicine.getRateperUnit());
            pstmt.setString(3,medicine.getType());
            pstmt.setLong(4,medicine.getCodeNumber());
            rowUpdated=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    //Remove a record.
    @Override
    public int remove(long key) {
        String sql="delete from "+tableName+ " where code=?";
        int rowDeleted=0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1,key);
            rowDeleted=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }
}



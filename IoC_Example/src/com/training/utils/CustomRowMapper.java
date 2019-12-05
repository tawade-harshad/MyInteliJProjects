package com.training.utils;

import com.training.beans.Distributor;
import com.training.beans.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomRowMapper implements RowMapper {

    @Autowired
    private JdbcTemplate template;

    private static String tableName="JPMedicine";

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {

        Medicine med = new Medicine();
        Distributor dist = new Distributor();
//        while(resultSet.next()){
            med.setCode(resultSet.getLong("Code"));
            med.setMedicineName(resultSet.getString("Medicine_Name"));
            med.setRatePerUnit(resultSet.getDouble("Rate_Per_Unit"));
            dist.setDistributorId(resultSet.getLong("Distributor_Id"));
            dist.setDistributorName(resultSet.getString("Distributor_Name"));
            med.setDistributor(dist);
//        }
        return med;
    }
}

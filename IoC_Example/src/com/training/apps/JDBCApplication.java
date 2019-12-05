package com.training.apps;

import com.training.beans.Medicine;
import com.training.config.DBConfig;
import com.training.ifaces.MyRespository;
import com.training.utils.CustomRowMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;


public class JDBCApplication {

    public static void main(String[] args) {

        Logger log = Logger.getAnonymousLogger();
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);

        MyRespository<Medicine> dao = ctx.getBean(MyRespository.class);

        Scanner sc = new Scanner(System.in);


        //Adding a record.
        Medicine crocin = ctx.getBean(Medicine.class);
        crocin.setCode(2022);
        crocin.setMedicineName("M.Crocin");
        crocin.setRatePerUnit(28.01);

        /*int rowAdded = dao.add(crocin);
        log.info(Integer.toString(rowAdded) + " record added.");*/

        //Find all records in the table.
        List<Map<String, Object>> rows = dao.findAll();

        System.out.println("****************** MEDICINE DETAILS *********************");
        for (Map<String,Object> eachRow: rows) {
            System.out.println("Code - " + eachRow.get("Code") + "|| Name - " + eachRow.get("Medicine_Name") + "|| Cost - " + eachRow.get("Rate_Per_Unit"));
        }
        System.out.println("*********************************************************");


        //Delete a record from table.
     /*   System.out.println("******* REMOVE FUNCTION *************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter medicine Code : ");
        int code = Integer.parseInt(sc.next());
        int rowDeleted = dao.remove(code);
        log.info(Integer.toString(rowDeleted) + " record deleted.");*/

        //Find a record by Medicine Code - ID
        System.out.println("******* DISPLAY RECORD BY MEDICINE ID *************");

        System.out.println("Enter medicine Code : ");
        int medicineCode = Integer.parseInt(sc.next());
        Medicine findMedicineById = dao.findById(medicineCode);
        System.out.println("Code - " + findMedicineById.getCode() + " || Name - " + findMedicineById.getMedicineName() + " || Cost - " + findMedicineById.getRatePerUnit());
        System.out.println("Distributor Id - " + findMedicineById.getDistributor().getDistributorId() + " || Distributor Name - " + findMedicineById.getDistributor().getDistributorName());
        System.out.println("********* DISPLAY ENDED *************");


        //Update a record by Medicine Code - ID
       /* System.out.println("******* UPDATE RECORD BY MEDICINE ID *************");

        System.out.println("Enter medicine Code  for which you want to update record : ");
        int updateMedCode = Integer.parseInt(sc.next());

        System.out.println("Enter new medicine Name : ");
        String updatedMedName = sc.next();

        System.out.println("Enter new medicine Cost : ");
        double updatedMedCost = Double.parseDouble(sc.next());

        Medicine updatedMedicine = ctx.getBean(Medicine.class);
        updatedMedicine.setCode(updateMedCode);
        updatedMedicine.setMedicineName(updatedMedName);
        updatedMedicine.setRatePerUnit(updatedMedCost);

        int rowUpdated = dao.update(updatedMedicine);
        log.info(Integer.toString(rowUpdated) + " record updated.");*/




    }
}

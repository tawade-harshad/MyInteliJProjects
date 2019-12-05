package com.training.resources;

import com.training.dao.MedicineDao;
import com.training.entity.Medicine;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/medicine")
public class MedicineResources {

    private MedicineDao dao;

    public MedicineResources() {
        dao = new MedicineDao();
    }

    // REST service to return a hard coded value.
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMedicine(){

        Medicine crocin = new Medicine(101,"B Complex X", 36.45,"Tablet");
        return Response.status(200).entity(crocin).build();
    }

    // REST service to Add a new record.
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addMedicine(Medicine medicine){

        Response response = Response.status(200).entity("Record Not Added").build();
        System.out.println("Server Add method called..");
        int rowAdded = dao.add(medicine);
        if(rowAdded == 1){
            response = Response.status(201).entity(medicine).build();
        }
        return response;
    }

    // REST service to update a record.
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Medicine medicine){
        Response response = Response.status(200).entity("Record Not Updated").build();
        int rowUpdated = dao.update(medicine);

        if(rowUpdated == 1){
            response = Response.status(200).entity(medicine).build();
        }
        return response;
    }

    // REST service to delete a record.
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(Medicine medicine){
        Response response = Response.status(200).entity("Record Not Deleted. Not Found").build();
        int rowDeleted = dao.remove(medicine.getCodeNumber());

        if(rowDeleted == 1){
            response = Response.status(200).entity(medicine).build();
        }

        return response;
    }

    // REST service to return all medicine records.
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllMedicines(){
        Response response = Response.status(204).entity("No Records found").build();
        List medList = dao.findAll();
        if(medList != null){
            response = Response.status(200).entity(medList).build();
        }
        return response;
    }

    // REST service to return medicine record for a particular code.
    @GET
    @Path("/srch/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") long key){
        Response response = Response.status(204).entity("Record Not Found").build();
        Medicine medFound = dao.findById(key);

        if(medFound != null){
            response = Response.status(200).entity(medFound).build();
        }
        return response;
    }

}


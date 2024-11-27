package com.example.rest_demo.controller;

import com.example.rest_demo.model.CloudVendor;
import com.example.rest_demo.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
@Controller
public class CloudVendorController {


    private final CloudVendorService cloudVendorService;
    @Autowired
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    @GetMapping("{vendorId}")
    public String getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

/*    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){

        return cloudVendorService.getAllCloudVendors();
    }*/

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
         cloudVendorService.createCloudVendor(cloudVendor);
        System.out.println("cloud vendor created sucessfully");
        return "cloud vendor sucessfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "cloud vendor updated sucessfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String VendorId) {
        cloudVendorService.deleteCloudVendor(VendorId);
        return "cloud vendor deleted successfully";
    }

}

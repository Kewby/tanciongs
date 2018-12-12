/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DBIPAddress;
import Connection.DL_json;
import Connection.JavaHTTPUrlConnectionReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author kirby
 */
public class DeliveryController {
    DBIPAddress dbip = new DBIPAddress();
    String IP = dbip.getIP();
    
    public void addDelivery(String productCode, int quantity, String dateDelivered, String supplier, int receivedBy, String expiryDate) throws UnsupportedEncodingException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println(productCode+", "+quantity+", "+dateDelivered+", "+supplier);
  
          String myUrl = "http://"+IP+"/TanciongStore_v2/phpFiles/delivery/addDelivery.php?productCode="+productCode+""
                  + "&quantity="+quantity+""
                  + "&dateDelivered="+URLEncoder.encode(dateDelivered,"UTF-8")+""
                  + "&supplier="+URLEncoder.encode(supplier,"UTF-8")+""
                  + "&receivedBy="+receivedBy+"&expiryDate="+URLEncoder.encode(expiryDate,"UTF-8")+"";

          new JavaHTTPUrlConnectionReader(myUrl);
          JOptionPane.showMessageDialog(null, "Successfully Added!");
    }
    
    public void addBatch(String productCode, int quantity, String dateDelivered, String expiryDate, String supplier) throws UnsupportedEncodingException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println(productCode+", "+quantity+", "+dateDelivered);
  
          String myUrl = "http://"+IP+"/TanciongStore_v2/phpFiles/delivery/addBatch.php?productCode="+productCode+""
                  + "&quantity="+quantity+""
                  + "&dateDelivered="+URLEncoder.encode(dateDelivered,"UTF-8")+""
                  + "&expiryDate="+URLEncoder.encode(expiryDate,"UTF-8")+""
                  + "&supplier="+URLEncoder.encode(supplier,"UTF-8")+"";

          new JavaHTTPUrlConnectionReader(myUrl);
          JOptionPane.showMessageDialog(null, "Successfully Added!");
    }
    
    public void addUpdateStock(String productCode, int quantity){
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        
        String myUrl = "http://"+IP+"/TanciongStore_v2/phpFiles/stock/addUpdateStock.php?productCode="+productCode+""
                  + "&quantity="+quantity+"";
          new JavaHTTPUrlConnectionReader(myUrl);
          JOptionPane.showMessageDialog(null, "Success Add/Update Stock!");
    }
    
    public void getCategories(){
        System.out.println("Fetching Categories");
        
        DL_json download = new DL_json();
        String myUrl = "http://"+IP+"/TanciongStore_v2/phpFiles/category/category.php?";
        System.out.println("Got Categories!");
        new JavaHTTPUrlConnectionReader(myUrl);
        System.out.println(myUrl);
        
        try {
            download.downloadData("http://"+IP+"/TanciongStore_v2/phpFiles/category/category.json", "category");
        }   catch (IOException ex) {
            //Logger.getLogger(Medication_list.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    public void getSupplier(){
        System.out.println("Fetching Suppliers");
        
        DL_json download = new DL_json();
        String myUrl = "http://"+IP+"/TanciongStore_v2/phpFiles/supplier/getSupplier.php?";
        System.out.println("Got Suppliers!");
        new JavaHTTPUrlConnectionReader(myUrl);
        System.out.println(myUrl);
        
        try {
            download.downloadData("http://"+IP+"/TanciongStore_v2/phpFiles/supplier/getSupplier.json", "getSupplier");
        }   catch (IOException ex) {
            //Logger.getLogger(Medication_list.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    public void getProductDetails(String productCode){
        System.out.println("Fetching Product Details");
        
        DL_json download = new DL_json();
        String myUrl = "http://"+IP+"/TanciongStore_v2/phpFiles/delivery/getProductDetails.php?productCode="+productCode+"";
        System.out.println("Got Suppliers!");
        new JavaHTTPUrlConnectionReader(myUrl);
        System.out.println(myUrl);
        
        try {
            download.downloadData("http://"+IP+"/TanciongStore_v2/phpFiles/supplier/getProductDetails.json", "getProductDetails");
        }   catch (IOException ex) {
            //Logger.getLogger(Medication_list.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }  
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.Generic_Implement;
import entity1.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Bus<Thing> {
   private Thing entity;
   private ArrayList<Thing> list;
   public  ArrayList getList(Class<Thing> instance){
       list=new ArrayList();
       list=Generic_BUS.getAll(instance);
       return list;
   }
   public boolean Them(Thing instance){
       int tempsize=list.size();
       list.add(instance);
       Thread thread=new Thread(new Runnable(){
          public void run(){
             Generic_Implement.insert(list.get(list.size()-1));
          
          }
       });
       thread.start();
     
           
       if(tempsize<list.size()){
           return true;
       }
       return false;
   }
  /**
 * Sài cái Sửa này ae phải cho cái id của thằng instance bằng với 
 * thằng i 
 * Bởi vì phương thức này sẽ sử theo id của thằng truyền vào
 *  Nếu ID không nằm trong ID của csdl thì nó sẽ không thực hiện
 * @param instance entity cần Sửa 
 * @param
 *  index là dòng thứ bao nhiêu trên JTable nha
 *  nó tương đương với phần tử thứ bn trong ArrayList
 * @return void
 * @throws Exception Mô tả về các exception có thể xảy ra.
 */
   public boolean Sua(Thing instance,int index){
       try{
       Thing tempObject=list.get(index);    //Object temp để lấy id phần tử ban đầu chưa update
       list.set(index, instance);
       Thing persistentObject=list.get(index);// Object persisted
       
       new Thread(new Runnable(){
           public void run(){
               Generic_Implement.SuaTheoID(persistentObject);
           }
       }).start();
       }
       catch(IndexOutOfBoundsException ioe){
           JOptionPane.showMessageDialog(null, "Xay ra loi!", "Sua danh sach", JOptionPane.ERROR_MESSAGE);
       }
       return true;
   }
     /**
 * Sài cái Xóa này ae phải cho cái id của thằng instance bằng với 
 * thằng i 
 * Bởi vì phương thức này sẽ sử theo id của thằng truyền vào
 * Nếu ID không nằm trong ID của csdl thì nó sẽ không thực hiện
 * @param instance entity cần Xóa
 * @param
 *  index là dòng thứ bao nhiêu trên JTable nha
 *  nó tương đương với phần tử thứ bn trong ArrayList
 * @return void
 * @throws Exception Mô tả về các exception có thể xảy ra.
 */
   public boolean Xoa(Thing instance,int index){
       list.set(index,instance);
        new Thread(new Runnable(){
           public void run(){
               Generic_Implement.delete(instance);
           }
       }).start();
       
       
       return true;
   }
   public ArrayList TimKiem(String condition){
      ArrayList<Thing> result=new ArrayList();
      for(Thing element:list){
          System.out.println(element.toString());
          if(element.toString().contains(condition)){
              result.add(element);
          }
      }
      return result;
       
   }
   
   
   
   

    public ArrayList<Thing> getList() {
        return list;
    }
   
   
   public Bus(){
       list=new ArrayList();
   }
    
}

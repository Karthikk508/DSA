package OnlineShoppingApp;

class Inventory {       // can be add when admin/manager login

       static int product_id = 1;
       int idp;
       String name;
       String description;
       int price;
       String createdBy;
       String modifiedBy;
       int createdTime;
       int modifiedTime;
       int quantity;

       Inventory(int product_id,String description,String name,int price,String createdBy,String modifiedBy, int modifiedTime,int createdTime,int quantity)
       {
           this.idp = product_id++;
           this.name = name;
           this.description = description;
           this.price = price;
           this.createdBy = createdBy;
           this.modifiedBy = modifiedBy;
           this.createdTime = createdTime;
           this.modifiedTime = modifiedTime;
           this.quantity = quantity;
       }



}

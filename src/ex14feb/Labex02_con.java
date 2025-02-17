package ex14feb;

 class Labex02_con {
     String name;
     long price ;
     String model;

     Labex02_con()
    {
        String name = "unknown name";
        long price = 7888889;
        String model = "yyyy";
    }


     Labex02_con(String name,long price, String model)
     {
         this.name = name;
         this.price= price;
         this.model =model;
     }


}

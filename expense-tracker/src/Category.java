public class Category {

    private final String name;

    public Category(String name){
       if(name == null || name.isBlank()) {
           throw new IllegalArgumentException("category name is required");
       }
       this.name = name.trim().toLowerCase();
   }
   public String getName(){
        return name;
   }

   @Override
    public String toString(){
        return name;
   }




}

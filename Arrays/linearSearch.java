public class linearSearch {

    public static int linear_Search(String menu[], String key) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        String menu[] = {"dosa", "chole", "bhature", "samosa"};

        String key = "samosa";
        
        int index = linear_Search(menu, key);
        if(index == -1) {
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at index: " + index);
        }
    }

}

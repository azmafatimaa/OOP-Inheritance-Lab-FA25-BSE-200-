public class OnlineAccount {
    private String username;
    private String email;
    private String createdDate;
    public OnlineAccount(String username,String email,String createdDate){
        this.username=username;
        this.email= email;
        this.createdDate= createdDate;
    }
    public void displayInfo(){
        System.out.println("Username:"+ username);
        System.out.println("Email:"+email);
        System.out.println("Created Date:"+createdDate);
    }
    public void login() {
        System.out.println(username+" logged in.");
    }
    public String toString() {
        return "OnlineAccount{"+username+"," +email +"}";
    }
}

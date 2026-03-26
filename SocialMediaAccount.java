public class SocialMediaAccount extends OnlineAccount{
    private int followers;
    private int postCount;

    public SocialMediaAccount(String username,String email,String createdDate,int followers,int postCount){
        super(username, email, createdDate);
        this.followers=followers;
        this.postCount=postCount;

    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Followers:"+ followers);
        System.out.println("Posts: "+postCount);
    }
    public void postContent() {
        System.out.println("Content posted!");
    }
    public double calculateEngagement(){
        return followers * 0.1;
    }
    public String toString(){
        return "SocialMediaAccount{"+followers+"followers}";
    }
}


public class InstagramBusinessAccount extends SocialMediaAccount{
    private String businessCategory;
    private double adBudget;
    public InstagramBusinessAccount(String username,String email,String createdDate,int followers,int postCount,String businessCategory,double adBudget) {
        super(username,email,createdDate,followers,postCount);
        this.businessCategory=businessCategory;
        this.adBudget=adBudget;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Business Category:"+businessCategory);
        System.out.println("Ad Budget: "+adBudget);
    }
    public void showAnalytics() {
        System.out.println("Analytics : High engagement business account");
    }
    public double calculateEngagement(){
        return super.calculateEngagement()+adBudget * 0.05;
    }
    public String toString() {
        return "InstagramBusinessAccount{"+businessCategory+"}";
    }
}

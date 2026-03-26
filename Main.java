public class Main {
    public static void main(String[] args){

        OnlineAccount oacc = new OnlineAccount("azmaf.fatima","azmafatima@gmail.com","2022");
        SocialMediaAccount sma = new SocialMediaAccount("talha.th", "thtalha@gmail.com", "2024", 1000, 50);
        InstagramBusinessAccount igba = new InstagramBusinessAccount("kainat.kf", "kainatkf1@gmail.com", "2017", 200000000, 1000, "Cosmetics", 20000
        );
        System.out.println("----Online Account----");
        oacc.displayInfo();
        oacc.login();

        System.out.println("\n---- Social Media Account ----");
        sma.displayInfo();
        sma.postContent();
        System.out.println("Engagement: "+sma.calculateEngagement());

        System.out.println("\n----Instagram Business Account ----");
        igba.displayInfo();
        igba.postContent();
        igba.showAnalytics();
        System.out.println("Engagement:"+igba.calculateEngagement());
    }
}


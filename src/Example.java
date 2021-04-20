

public static class Example {
    public static void main(String args[]) {
        Village.ChinaPeople chinaPeople=new Village.ChinaPeople();
        AmericanPeople americanPeople=new AmericanPeople();
        Village.BeijingPeople beijingPeople=new Village.BeijingPeople();
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();
        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera();
        beijingPeople.chinaGongfu();
    }
}


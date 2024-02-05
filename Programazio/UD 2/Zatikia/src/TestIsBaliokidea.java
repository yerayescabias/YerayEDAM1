public class TestIsBaliokidea {

    public static void main(String[] args) {

        Zatikia zat1 = new Zatikia(1,2);

        Zatikia zat2 = new Zatikia(1,3);

        Zatikia zat3 = new Zatikia(1,4);

        Zatikia zat4 = new Zatikia(2,4);

        Zatikia zat5 = new Zatikia(-1,2);

        Zatikia zat6 = new Zatikia(2,0);



        System.out.println(zat1+" eta " + zat2 + " baliokideak al dira? "+ zat1.isBaliokidea(zat2));

        System.out.println(zat1+" eta " + zat3 + " baliokideak al dira? "+ zat1.isBaliokidea(zat3));

        System.out.println(zat1+" eta " + zat4 + " baliokideak al dira? "+ zat1.isBaliokidea(zat4));

        System.out.println(zat1+" eta " + zat5 + " baliokideak al dira? "+ zat1.isBaliokidea(zat5));

        System.out.println(zat1+" eta " + zat6 + " baliokideak al dira? "+ zat1.isBaliokidea(zat6));

    }

}
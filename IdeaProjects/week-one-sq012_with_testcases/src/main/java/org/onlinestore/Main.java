package org.onlinestore;

        public  class Main {
        public static void main(String[] args) {

    //
    //        //IMPLEMENTATION OF CUSTOMER REQUEST

            //Creation an object for product
            Products shawama = new Products(2323,"Shawama",234.5,"12/07/2022","23/02/2023");

            Customers customers = new Customers("Davie","Mark","no 3 Air Port rd","090776543667",345667.00);
            customers.placeOder(shawama,5,456.00);




            //Job Application by an applicant
            Applicant applicant = new Applicant("johnBull","Favour",26,"liberty@gmail.com",
                    "0806754354",'M',"org.onlinestore.Main.Main.org.onlinestore.Main.Main.Cashier","B.sc");

            //org.onlinestore.Main.Main.Manager implementing of the hire method
            Manager manager = new Manager("Liberty","Imobi",32,"lib@gmail.com",
                    "07089611236",'M');
            manager.hire(applicant);
            Cashier cashier =  manager.hire(applicant);
            manager.fire(cashier);
            System.out.println(cashier.getFirstName());

            //cashier.generateReceipt("CYRIL GREG",);


            Customers customers1 = new Customers("Ikena","obefi","32 babani str, Ajegunle","0906754327",606.00);
            Cashier cashier1 = new Cashier("hommy","love",45,"fm@gmail.com","0705564329",'F',"org.onlinestore.Main.Main.org.onlinestore.Main.Main.Cashier");
            Products product1 = new Products(7449,"Bournvita",345.00,"07/05/2011","08/02/2022");
            Products product2 = new Products(70049,"Peak Milk",385.00,"07/05/2021","08/02/2023");
            Products[] products = {product1,product2};
            cashier1.sellProducts(products,customers1);
            customers1.setWallet(300.00);
            cashier1.sellProducts(products,customers1);

        }


    }

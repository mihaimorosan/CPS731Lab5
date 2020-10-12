package com.example.lab5.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 10;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(position);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {

        private String[] carTitle = {
                "BMW M3 E46",
                "Nissan Skyline R34 GTR",
                "Chevrolet Camaro Z28",
                "Lamborghini Aventador S",
                "Shelby Cobra 427",
                "Aston Martin DB5",
                "Mazda RX-7 FD",
                "Honda S2000",
                "Toyota Supra MK4",
                "Mercedes-Benz G63 AMG"
        };

        private String[] carDescription = {
                "The E46 M3 is powered by the BMW S54 inline-six engine with either a 6-speed manual or a 6-speed SMG-II automated manual transmission. The M3 was introduced in late 2000 and was produced in coupe and convertible body styles only.",
                "The GF-BNR34 (R34) Nissan Skyline GT-R, GT-R V·Spec and GT-R V·Spec N1 models were introduced in January 1999. The R34 GT-R was shorter (from front to rear), and the front overhang was reduced as compared to its predecessor. The valve covers were painted glossy red (colour code Cherry Red Effect Z24 or X1020), as opposed to black in previous models.",
                "The Chevrolet Camaro is a mid-size American automobile manufactured by Chevrolet, classified as a pony car and some versions also as a muscle car. It went on sale on September 29, 1966, for the 1967 model year and was designed as a competing model to the Ford Mustang.",
                "The Lamborghini Aventador S is a mid-engine sports car produced by the Italian automotive manufacturer Lamborghini. In keeping with Lamborghini tradition, the Aventador is named after a fighting bull.",
                "The AC Cobra, sold in the United States as the Shelby Cobra and AC Shelby Cobra, is a British-American sports car with a Ford V8 engine, produced intermittently in both the UK and the US since 1962.",
                "The Aston Martin DB5 is a British luxury grand tourer that was made by Aston Martin and designed by the Italian coachbuilder Carrozzeria Touring Superleggera. Released in 1963, it was an evolution of the final series of DB4. Although not the first in the DB series, the DB5 is the best-known cinematic James Bond car, first appearing in the James Bond film Goldfinger.",
                "The Mazda RX-7 is a front/mid-engine, rear-wheel-drive, rotary engine-powered sports car that was manufactured and marketed by Mazda from 1978 to 2002 across three generations, all of which made use of a compact, lightweight Wankel rotary engine.",
                "The Honda S2000 is an open top sports car that was manufactured by Japanese automobile manufacturer Honda, from 1999 to 2009. First shown as a concept car at the Tokyo Motor Show in 1995, the production version was launched on April 15, 1999 to celebrate the company's 50th anniversary.",
                "The Toyota Supra is a sports car and grand tourer manufactured by Toyota Motor Corporation beginning in 1978. The initial four generations of the Supra were produced from 1978 to 2002.",
                "The AMG G 63 is a legend raised to a higher power for a new era. Advanced luxury, unwavering confidence, and seemingly endless individualization let you create a G that's at ease in any corner of the world."
        };

        private String[] carSpecifications = {
                //BMW
                "SPECIFICATIONS\n\t" +
                        "Engine: S54 Inline 6\n\t" +
                        "Horse power: 343 HP for European Specs, 333 HP\n\t\t" +
                        "for U.S\n\t" +
                        "Torque: 269 lb-ft for European Specs, 262 lb-ft for\n\t\t" +
                        "U.S\n\t" +
                        "0-60MPH: 5.1 seconds\n\t" +
                        "Top Speed: 155MPH (249 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Track Racing\n\t" +
                        "* Drifting\n\t" +
                        "* Show\n\n\n" +
                        "AVERAGE PRICE\n\t" +
                        "$15,500 - $28,000\n\n\n" +
                        "HISTORY\n\t" +
                        "In 1993, the development programme for the E46\n\t\t" +
                        "began under chief engineer Wolfgang Ziebart and\n\t\t" +
                        "head of R&D Wolfgang Reitzle. In late 1993,\n\t\t" +
                        "design work began under chief designer Chris\n\t\t" +
                        "Bangle and continued into 1995. In May 1995,\n\t\t" +
                        "the general exterior design of the E46 by\n\t\t" +
                        "Erik Goplen of DesignworksUSA was approved\n\t\t" +
                        "and as a result DesignworksUSA was contracted\n\t\t" +
                        "by BMW to work alongside BMW Group's in-house\n\t\t" +
                        "design team to create the exterior bodywork\n\t\t" +
                        "for the 3 Series range in February 1996.\n\t\t" +
                        "The design team put an emphasis on improving\n\t\t" +
                        "aerodynamics and increasing the car's aggressive\n\t\t" +
                        "stance. Design patents were filed in Germany\n\t\t" +
                        "on 16 July 1997 and in the US on 16 January\n\t\t" +
                        "1998.",
                //NISSAN
                "SPECIFICATIONS\n\t" +
                        "Engine: RB26DETT Inline 6\n\t" +
                        "Horse power: 330 HP\n\t" +
                        "Torque: 293 lb-ft\n\t" +
                        "0-60MPH: 4.9 seconds\n\t" +
                        "Top Speed: 155MPH (249 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Track Racing\n\t" +
                        "* Drag Racing\n\t" +
                        "* Drifting\n\t" +
                        "* Show\n\n\n" +
                        "AVERAGE PRICE\n\t" +
                        "$75,000 - $100,000\n\n\n" +
                        "HISTORY\n\t" +
                        "At the time of the R34's introduction, like the\n\t\t" +
                        "R32 and R33, Nissan introduced an R34 V·Spec\n\t\t" +
                        "N1 model. The R34 V·Spec N1 was equipped\n\t\t" +
                        "similar to the R32 and R33 N1 models – a\n\t\t" +
                        "homologation special. It was sold without\n\t\t" +
                        "air conditioning, audio equipment, rear wiper, or\n\t\t" +
                        "boot lining, but ABS remained. The new R34 N1\n\t\t" +
                        "was also given the new R34 N1 engine. Only 38\n\t\t" +
                        "known R34 V·Spec N1 models were produced\n\t\t" +
                        "from the factory, 12 of which Nismo, Nissans\n\t\t" +
                        "racing division, used for Super Taikyu racing. The\n\t\t" +
                        "rest were sold to various customers, mostly racing\n\t\t" +
                        "teams and tuning garages.",
                //CHEVROLET
                "SPECIFICATIONS\n\t" +
                        "Engine: LS7 V8\n\t" +
                        "Horse power: 505 HP\n\t" +
                        "Torque: 481 lb-ft\n\t" +
                        "0-60MPH: 3.8 seconds\n\t" +
                        "Top Speed: 180MPH (290 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Track Racing\n\t" +
                        "* Drag Racing\n\t" +
                        "* Drifting\n\n\n" +
                        "AVERAGE PRICE\n\t" +
                        "$25,000 - $50,000\n\n\n" +
                        "HISTORY\n\t" +
                        "Assembly of the fifth-generation Camaro took\n\t\t" +
                        "place in Canada like its predecessor. Production,\n\t\t" +
                        "however, was shifted from Sainte-Thérèse,\n\t\t" +
                        "Quebec to Oshawa, Ontario. Chevrolet started\n\t\t" +
                        "taking pre-orders for the 2010 Camaro on\n\t\t" +
                        "October 13, 2008, however sales to rentals\n\t\t" +
                        "and orders made after the pre-order period,\n\t\t" +
                        "were processed before many of the pre-orders.\n\t\t" +
                        "By the end of 2008, General Motors confirmed\n\t\t" +
                        "more than 10,000 advanced orders and that\n\t\t" +
                        "all pre-orders would be completed by\n\t\t" +
                        "October 2009.",
                //LAMBORGHINI
                "SPECIFICATIONS\n\t" +
                        "Engine: 700 PS V12\n\t" +
                        "Horse power: 690 HP\n\t" +
                        "Torque: 509 lb-ft\n\t" +
                        "0-60MPH: 2.9 seconds\n\t" +
                        "Top Speed: 217MPH (350 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Show\n\n\n" +
                        "PRICE\n\t" +
                        "$421,321\n\n\n" +
                        "HISTORY\n\t" +
                        "The Aventador S received four wheel steering,\n\t\t" +
                        "permanent four wheel drive and a slightly updated\n\t\t" +
                        "suspension. The suspension is controlled\n\t\t" +
                        "by the ‘Lamborghini Dinamica Veicolo Attiva’\n\t\t" +
                        "(LDVA) control unit. The LDVA has four\n\t\t" +
                        "selectable modes – Sport, Strada (Street),\n\t\t" +
                        "Corsa (Track) and Ego (i.e. individual). Carbon\n\t\t" +
                        "ceramic brakes are standard (front: 400 mm,\n\t\t" +
                        "rear: 380 mm). The nose was redesigned\n\t\t" +
                        "with a bigger front splitter and two new air ducts\n\t\t" +
                        "in the front bumper. At the rear it has a new black\n\t\t" +
                        "rear diffuser with fins, and three single exit\n\t\t" +
                        "exhaust tips. It has 130 percent more front\n\t\t" +
                        "downforce than the standard Aventador LP700-4.",
                //SHELBY
                "SPECIFICATIONS\n\t" +
                        "Engine: Ford 427 V8\n\t" +
                        "Horse power: 360 HP\n\t" +
                        "Torque: 419 lb-ft\n\t" +
                        "0-60MPH: 3.4 seconds\n\t" +
                        "Top Speed: 160MPH (257 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Show\n\n\n" +
                        "PRICE\n\t" +
                        "Priceless\n\n\n" +
                        "HISTORY\n\t" +
                        "The Shelby 427 Cobra began life in England\n\t\t" +
                        "as the AC Ace in 1953. It was initially offered\n\t\t" +
                        "with leaf spring suspension and an anemic\n\t\t" +
                        "straight-six. Carroll Shelby was a racer who\n\t\t" +
                        "was looking to take on the world. Ford\n\t\t" +
                        "supplied their 289 V8 and the combination\n\t\t" +
                        "was christened the 1965 Shelby Cobra.",
                //ASTON MARTIN
                "SPECIFICATIONS\n\t" +
                        "Engine: Straight 6\n\t" +
                        "Horse power: 282 HP\n\t" +
                        "Torque: 288 lb-ft\n\t" +
                        "0-60MPH: 6.2 seconds\n\t" +
                        "Top Speed: 149MPH (240 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Show\n\n\n" +
                        "PRICE\n\t" +
                        "Priceless\n\n\n" +
                        "HISTORY\n\t" +
                        "The Aston Martin DB5 is among the best-known\n\t\t" +
                        "cars in the world thanks to special effects\n\t\t" +
                        "expert John Stears, who modified the DB5 for\n\t\t" +
                        "use by James Bond in the film Goldfinger(1964).\n\t\t" +
                        "Although Ian Fleming had placed Bond in a DB\n\t\t" +
                        "Mark III in the novel, Stears persuaded the\n\t\t" +
                        "company to make its DB5 prototype available.",
                //MAZDA
                "SPECIFICATIONS\n\t" +
                        "Engine: Wankel Rotary Engine\n\t" +
                        "Horse power: 276 HP\n\t" +
                        "Torque: 217 lb-ft\n\t" +
                        "0-60MPH: 5.3 seconds\n\t" +
                        "Top Speed: 155MPH (250 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Track Racking\n\t" +
                        "* Drifting\n\n\n" +
                        "AVERAGE PRICE\n\t" +
                        "$35,000 - $48,000\n\n\n" +
                        "HISTORY\n\t" +
                        "The third generation RX-7, FD (chassis\n\t\t" +
                        "code FD3S for Japan and JM1FD for the North\n\t\t" +
                        "America), featured an updated body design.\n\t\t" +
                        "The 13B-REW was the first-ever mass-produced\n\t\t" +
                        "sequential twin-turbocharger system to be\n\t\t" +
                        "exported from Japan, boosting power to 255\n\t\t" +
                        "PS (188 kW; 252 hp) in 1993 and finally\n\t\t" +
                        "280 PS (206 kW; 276 hp) by the time production\n\t\t" +
                        "ended in Japan in 2002.",
                //HONDA
                "SPECIFICATIONS\n\t" +
                        "Engine: Inline 4\n\t" +
                        "Horse power: 240 HP\n\t" +
                        "Torque: 153 lb-ft\n\t" +
                        "0-60MPH: 5.8 seconds\n\t" +
                        "Top Speed: 172MPH (277 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Track Racking\n\t" +
                        "* Drifting\n\n\n" +
                        "AVERAGE PRICE\n\t" +
                        "$32,000 - $48,000\n\n\n" +
                        "HISTORY\n\t" +
                        "Honda announced the S2000 Type V on\n\t\t" +
                        "July 7, 2000 in the Japanese domestic\n\t\t" +
                        "market. Notable changes from the\n\t\t" +
                        "standard model include variable gear\n\t\t" +
                        "ratio steering (VGS), a steering system\n\t\t" +
                        "that continuously changes steering ratio\n\t\t" +
                        "based upon vehicle speed and steering angle\n\t\t" +
                        "to provide improved handling as well\n\t\t" +
                        "as more comfortable maneuvering in tight\n\t\t" +
                        "low-speed situations such as parking.",
                //TOYOTA
                "SPECIFICATIONS\n\t" +
                        "Engine: 2JZ-GTE Inline 6\n\t" +
                        "Horse power: 321 HP\n\t" +
                        "Torque: 315 lb-ft\n\t" +
                        "0-60MPH: 4.6 seconds\n\t" +
                        "Top Speed: 149MPH (240 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Track Racking\n\t" +
                        "* Drag Racing\n\t" +
                        "* Drifting\n\t" +
                        "* Show\n\n\n" +
                        "AVERAGE PRICE\n\t" +
                        "$75,000 - $100,000\n\n\n" +
                        "HISTORY\n\t" +
                        "In 1994, Toyota Racing Development\n\t\t" +
                        "displayed a replica of the 1994 JGTC BLITZ\n\t\t" +
                        "Racing Team Supra GT500 race car, known as\n\t\t" +
                        "the TRD3000GT. The differences with the\n\t\t" +
                        "standard Supra was mainly with the body kits,\n\t\t" +
                        "aiming for better aerodynamics. The new body\n\t\t" +
                        "kit made the car 60 mm wider at the front and\n\t\t" +
                        "50 mm wider at the rear. This allowed\n\t\t" +
                        "wider wheels to be fitted, which in\n\t\t" +
                        "turn improved the car's lateral grip.",
                //MERCEDES-BENZ
                "SPECIFICATIONS\n\t" +
                        "Engine: AMG V8\n\t" +
                        "Horse power: 585 HP\n\t" +
                        "Torque: 627 lb-ft\n\t" +
                        "0-60MPH: 4.5 seconds\n\t" +
                        "Top Speed: 160MPH (257 KM/H)\n\n\n" +
                        "MAINLY USED FOR\n\t" +
                        "* Off-roading\n\t" +
                        "* Show\n\n\n" +
                        "PRICE\n\t" +
                        "$157,445\n\n\n" +
                        "HISTORY\n\t" +
                        "The G-class was developed as a military vehicle\n\t\t" +
                        "from a suggestion by the Shah of Iran (at\n\t\t" +
                        "the time a significant Mercedes shareholder) to\n\t\t" +
                        "Mercedes and offered as a civilian version\n\t\t" +
                        "in 1979. In this role it is sometimes referred\n\t\t" +
                        "to as the \"Wolf\"",
        };

        private String[] carImage = {
                "bmw",
                "nissan",
                "chevrolet",
                "lamborghini",
                "shelby",
                "aston",
                "mazda",
                "honda",
                "toyota",
                "benz"
        };

        public final String id;
        public final String title;
        public final String description;
        public final String specifications;
        public final String image;

        public DummyItem(int id) {
            this.id = String.valueOf(id);
            this.title = carTitle[id - 1];
            this.description = carDescription[id - 1];
            this.specifications = carSpecifications[id - 1];
            this.image = carImage[id - 1];
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
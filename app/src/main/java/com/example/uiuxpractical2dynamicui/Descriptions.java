package com.example.uiuxpractical2dynamicui;

public class Descriptions {

    private String name;
    private String desc;
    private int imgRes;

    private Descriptions (String n, String d, int i)
    {
        this.name = n;
        this.desc = d;
        this.imgRes = i;
    }

    public static final Descriptions [] descriptionArray ={

            new Descriptions("ABOUT NASA", "The National Aeronautics and Space Administration (NASA, /ˈnæsə/) is an independent agency of the United States Federal Government responsible for the civilian space program, as well as aeronautics and aerospace research.[note 1]\n" +
                    "\n" +
                    "NASA was established in 1958, succeeding the National Advisory Committee for Aeronautics (NACA). The new agency was to have a distinctly civilian orientation, encouraging peaceful applications in space science.[7][8][9] Since its establishment, most US space exploration efforts have been led by NASA, including the Apollo Moon landing missions, the Skylab space station, and later the Space Shuttle. NASA is supporting the International Space Station and is overseeing the development of the Orion Multi-Purpose Crew Vehicle, the Space Launch System and Commercial Crew vehicles. The agency is also responsible for the Launch Services Program which provides oversight of launch operations and countdown management for uncrewed NASA launches.", R.drawable.logo),

            new Descriptions("VOYAGER 1", "Voyager 1 is a space probe launched by NASA on September 5, 1977. Part of the Voyager program to study the outer Solar System, Voyager 1 was launched 16 days after its twin, Voyager 2. Having operated for 42 years, 3 months and 18 days as of December 23, 2019, the spacecraft still communicates with the Deep Space Network to receive routine commands and to transmit data to Earth. At a distance of 147.380 AU (22.0 billion km; 13.7 billion mi) from Earth as of November 4, 2019[3] it is the most distant man-made object from Earth.[4]\n" +
                    "\n" +
                    "The probe's objectives included flybys of Jupiter, Saturn, and Saturn's largest moon, Titan. Although the spacecraft's course could have been altered to include a Pluto encounter by forgoing the Titan flyby, exploration of the moon took priority because it was known to have a substantial atmosphere.[5][6][7] Voyager 1 studied the weather, magnetic fields, and rings of the two planets and was the first probe to provide detailed images of their moons.", R.drawable.voyager_1),
            new Descriptions("VOYAGER 1", "Voyager 1 is a space probe launched by NASA on September 5, 1977. Part of the Voyager program to study the outer Solar System, Voyager 1 was launched 16 days after its twin, Voyager 2. Having operated for 42 years, 3 months and 18 days as of December 23, 2019, the spacecraft still communicates with the Deep Space Network to receive routine commands and to transmit data to Earth. At a distance of 147.380 AU (22.0 billion km; 13.7 billion mi) from Earth as of November 4, 2019[3] it is the most distant man-made object from Earth.[4]\n" +
                    "\n" +
                    "The probe's objectives included flybys of Jupiter, Saturn, and Saturn's largest moon, Titan. Although the spacecraft's course could have been altered to include a Pluto encounter by forgoing the Titan flyby, exploration of the moon took priority because it was known to have a substantial atmosphere.[5][6][7] Voyager 1 studied the weather, magnetic fields, and rings of the two planets and was the first probe to provide detailed images of their moons.", R.drawable.voyager_1),
            new Descriptions("VOYAGER 1", "Voyager 1 is a space probe launched by NASA on September 5, 1977. Part of the Voyager program to study the outer Solar System, Voyager 1 was launched 16 days after its twin, Voyager 2. Having operated for 42 years, 3 months and 18 days as of December 23, 2019, the spacecraft still communicates with the Deep Space Network to receive routine commands and to transmit data to Earth. At a distance of 147.380 AU (22.0 billion km; 13.7 billion mi) from Earth as of November 4, 2019[3] it is the most distant man-made object from Earth.[4]\n" +
                    "\n" +
                    "The probe's objectives included flybys of Jupiter, Saturn, and Saturn's largest moon, Titan. Although the spacecraft's course could have been altered to include a Pluto encounter by forgoing the Titan flyby, exploration of the moon took priority because it was known to have a substantial atmosphere.[5][6][7] Voyager 1 studied the weather, magnetic fields, and rings of the two planets and was the first probe to provide detailed images of their moons.", R.drawable.voyager_1)

    };

    public String getName()
    {
        return name;
    }

    public String getDesc()
    {
        return desc;
    }

    public int getImgRes()
    {
        return imgRes;
    }

    public String toString()
    {
        return this.name;
    }
}

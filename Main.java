public class Main {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Gyrados",100,2037,"Hydro Pump", "Hyper Beam", "Surf", "Dragon Rage");
        Pokemon p2 = new Pokemon("Magmar",97,2667, "Fire Blast", "Flamethrower", "Lava Plume", "Fire Punch");
        Pokemon p3 = new Pokemon("Lickitung",86,2753,"Giga Impact", "Double-Edge", "Zen Headbutt", "Bulldoze");
        Pokemon p4 = new Pokemon("Alakazam",89,2615,"Psyshock", "Psycho Cut", "Psybeam", "Teleport");
        Pokemon p5 = new Pokemon("Arcanine",99,2568, "Flamethrower", "Flare Blitz", "Flame Wheel", "Fire Fang");
        Pokemon p6 = new Pokemon("Exeggutor",78,2667,"Wood Hammer", "Solar Beam", "Seed Bomb", "Mega Drain");
       
        p1.print();
        p2.print();
        p3.print();
        p4.print();
        p5.print();
        p6.print();
    }   
}
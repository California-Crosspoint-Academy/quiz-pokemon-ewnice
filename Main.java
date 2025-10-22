public class Main {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Gengar",100,2037,"Phantom Force", "Shadow Claw", "Shadow Ball", "Lick");
        System.out.println(p1.name + " Level:" + p1.level + "\n1. " + p1.a1 + "\n2. " + p1.a2 + "\n3. " + p1.a3 + "\n4. " + p1.a4);


        Pokemon p2 = new Pokemon("Gardevoir",97,2667, "Future Sight", "Moonblast", "Mystical Fire", "Psychic");
        System.out.println(p2.name + " Level:" + p2.level + "\n1. " + p2.a1 + "\n2. " + p2.a2 + "\n3. " + p2.a3 + "\n4. " + p2.a4);



        Pokemon p3 = new Pokemon("Excadrill",86,2753,"Megahorn", "Earthquake", "Drill Run", "Dig");
        System.out.println(p3.name + " Level:" + p3.level + "\n1. " + p3.a1 + "\n2. " + p3.a2 + "\n3. " + p3.a3 + "\n4. " + p3.a4);
  

        Pokemon p4 = new Pokemon("Alakazam",89,2615,"Psyshock", "Psycho Cut", "Psybeam", "Teleport");
        System.out.println(p4.name + " Level:" + p4.level + "\n1. " + p4.a1 + "\n2. " + p4.a2 + "\n3. " + p4.a3 + "\n4. " + p4.a4);
 

        Pokemon p5 = new Pokemon("Arcanine",99,2568, "Flamethrower", "Flare Blitz", "Flame Wheel", "Fire Fang");
        System.out.println(p5.name + " Level:" + p5.level + "\n1. " + p5.a1 + "\n2. " + p5.a2 + "\n3. " + p5.a3 + "\n4. " + p5.a4);


        Pokemon p6 = new Pokemon("Exeggutor",78,2667,"Wood Hammer", "Solar Beam", "Seed Bomb", "Mega Drain");
        System.out.println(p6.name + " Level:" + p6.level + "\n1. " + p6.a1 + "\n2. " + p6.a2 + "\n3. " + p6.a3 + "\n4. " + p6.a4);

        p1.a1();
        p2.a2();
        p3.a3();
        p4.a4();
        p5.a1();
        p6.a3();

    }   
}
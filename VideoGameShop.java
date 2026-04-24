public class VideoGameShop {
    public static void main(String[] args) {

        // ── Part 1: Declare the Inventory Array ──────────────────────────────
        String[] inventory = {"Fallout 76", "Outer Worlds", "Red Dead Redemption 2","Elden Ring",
                "Halo Infinite"};

        // ── Part 2: Access & Print Individual Items ───────────────────────────
        System.out.println("=== Featured Games ===");
        System.out.println("First game:  " + inventory[0]);   // index 0 → first element
        System.out.println("Third game:  " + inventory[2]);   // index 2 → third element
        System.out.println("Last game:   " + inventory[4]);   // index 4 → fifth (last) element

        // ── Part 3: Print All Items with a Standard For Loop ──────────────────
        System.out.println("\n=== Full Inventory (for loop) ===");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println((i + 1) + ". " + inventory[i]);
        }

        // ── Part 4: Print All Items with a For-Each Loop ──────────────────────
        System.out.println("\n=== Full Inventory (for-each loop) ===");
        for (String game : inventory) {
            System.out.println("- " + game);
        }

        // ── Part 5: Update the Inventory ─────────────────────────────────────
        System.out.println("\n=== Updating index 2 to 'Minecraft' ===");
        inventory[2] = "Minecraft";   // replaces "Red Dead Redemption 2"
        System.out.println("Updated inventory:");
        for (String game : inventory) {
            System.out.println("- " + game);
        }
    }
}


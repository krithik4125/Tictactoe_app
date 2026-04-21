public class SlotConverter {
    public static int[] convertSlotToIndices(int slot) {
        int index = slot - 1;
        int row = index / 3;
        int col = index % 3;
        return new int[]{row, col};
    }

    public static void main() {
        for (int slot = 1; slot <= 9; slot++) {
            int[] indices = convertSlotToIndices(slot);
            System.out.println("Slot " + slot + " → Row: " + indices[0] + ", Col: " + indices[1]);
        }
    }
}
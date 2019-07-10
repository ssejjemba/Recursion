/**
 * The Tower of Hanoi (also called the Tower of Brahma) We are given three rods and N number
 * of disks, initially all the disks are added to first rod (the leftmost one) in decreasing size order.
 * The objective is to transfer the entire stack of disks from first tower to third tower (the rightmost
 * one), moving only one disk at a time and never a larger one onto a smaller.
 */

public class TowerOfHanoi {

    public static void towerOfHanoi(int num, char src, char dst, char temp)
    {
        if (num < 1)
            return;
        towerOfHanoi(num - 1, src, temp, dst);
        System.out.println("Move"+num+"disk from peg"+src+" to peg " + dst);
        towerOfHanoi(num - 1, temp, dst, src);
    }

    public static void main(String[] args)
    {
        int num = 4;
        System.out.println("The sequence of moves in the Tower of Hanoi are : ");
        towerOfHanoi(num, 'A', 'C', 'B');
    }
}

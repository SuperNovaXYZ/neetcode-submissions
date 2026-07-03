class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        int left = 1;
        int right = maxPile;
        int bestSpeed = maxPile; 

        // --- OUTER COG: The Guessing Machine ---
        while (left <= right) {
            int guessSpeed = left + (right - left) / 2;
            int totalHours = 0; // Resets for this speed test!

            // --- INNER COG: The Clock Machine ---
            for (int pile : piles) {
                // This formula divides the pile by guessSpeed and rounds UP 
                totalHours += (pile + guessSpeed - 1) / guessSpeed;
            }

            // Outer cog compares the score against the goal 'h'
            if (totalHours <= h) {
                bestSpeed = guessSpeed;  // It worked! Save it as a winner.
                right = guessSpeed - 1;  // Shrink map down to try SLOWER speeds.
            } else {
                left = guessSpeed + 1;   // Too slow! Shrink map up to force FASTER speeds.
            }
        }

        return bestSpeed; 
    }
}
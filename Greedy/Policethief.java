public class Policethief {
    public static void main(String[] args) {

    }

    public static int catchThieves(char arr[], int n, int k) {
        ArrayList<Integer> Thief = new ArrayList<>();
        ArrayList<Integer> Police = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'T')
                Thief.add(i);
            else
                Police.add(i);
        }

        int i = 0, j = 0;
        int ans = 0;
        while (i < Police.size() && j < Thief.size()) {
            if (Math.abs(Thief.get(j) - Police.get(i)) <= k) {
                i++;
                j++;
                ans++;
            } else if (Thief.get(j) < Police.get(i) - k) {

                j++;
            } else {
                i++;
            }
        }
        return ans;
    }
}

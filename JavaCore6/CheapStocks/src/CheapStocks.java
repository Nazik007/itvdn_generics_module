class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        int L1 = stocks.length;
        String[] arr = new String[L1 * 2];
        for (int i = 0; i < stocks.length; i++) {
            String txt = stocks[i];
            String[] parts = txt.split(" ");
            arr[i*2] = parts[0];
            arr[i*2+1] = parts[1];
        }

        String otv = "";
        for (int j = 1; j < arr.length; j += 2) {
            if (Integer.parseInt(arr[j]) <= 200) {
                otv += arr[j-1] + " ";
            }
        }
        return otv;
    }

}
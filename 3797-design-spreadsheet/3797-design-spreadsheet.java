class Spreadsheet {
    Map<String, Integer> spreadsheet;

    public Spreadsheet(int rows) {
        spreadsheet = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        spreadsheet.put(cell, value);
    }
    
    public void resetCell(String cell) {
        spreadsheet.put(cell, 0);
    }
    
    public int getValue(String formula) {
        int index = formula.indexOf('+');
        String left = formula.substring(1, index);
        String right = formula.substring(index + 1);
        int x = Character.isLetter(left.charAt(0)) ? spreadsheet.getOrDefault(left, 0) : Integer.parseInt(left);
        int y = Character.isLetter(right.charAt(0)) ? spreadsheet.getOrDefault(right, 0) : Integer.parseInt(right);
        return x + y;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
# ZigZag Conversion Problem
```java
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) return s;

        int cycleLen = 2 * numRows - 2;
        StringBuilder result = new StringBuilder();

        for(int row = 0; row < numRows; row++){
            for(int i = row; i < s.length(); i += cycleLen){
                result.append(s.charAt(i));

                if(row != 0 && row != numRows - 1){
                    int j = i + (cycleLen - 2 * row);
                    if(j < s.length()){
                        result.append(s.charAt(j));
                    }
                }
            }
        }

        return result.toString();
    }
}
```
Obsłużenie przypadków brzegowych, jeśli `numRows == 1` lub `numRows >= s.length()`, od razu zwracamy `s`.
```java
  if(numRows == 1 || numRows >= s.length()) return s;
```
Zmienna `cycleLen` to przetrzymywania długości pełnego cyklu, i `result` do przechowywania wyniku.
```java
  int cycleLen = 2 * numRows - 2;
  StringBuilder result = new StringBuilder();
```

public class Main {
    //Дан массив строк, необходимо
    // a) удалить из него все дубли,
    // б) оставшиеся строки объединить в одну в порядке следования в массиве.
    public static void main(String[] args) {
        String[] strings = {"заяц", "волк", "заяц", "волк", "волк", "крот", "заяц", "дрофа"};
        System.out.println(removeDuplicates5(strings));
    }

    public static StringBuilder removeDuplicates5(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int k = 1; k < strings.length; k++ ) {
                if (strings[i].equals(strings[k]) && i != k) {
                    strings[k] = "";
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s: strings) {
            sb.append(s + " ");
        }
        return sb;
    }
}

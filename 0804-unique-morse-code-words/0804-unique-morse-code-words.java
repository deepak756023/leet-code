class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> mp = new HashMap<>();
        mp.put('a', ".-");
        mp.put('b', "-...");
        mp.put('c', "-.-.");
        mp.put('d', "-..");
        mp.put('e', ".");
        mp.put('f', "..-.");
        mp.put('g', "--.");
        mp.put('h', "....");
        mp.put('i', "..");
        mp.put('j', ".---");
        mp.put('k', "-.-");
        mp.put('l', ".-..");
        mp.put('m', "--");
        mp.put('n', "-.");
        mp.put('o', "---");
        mp.put('p', ".--.");
        mp.put('q', "--.-");
        mp.put('r', ".-.");
        mp.put('s', "...");
        mp.put('t', "-");
        mp.put('u', "..-");
        mp.put('v', "...-");
        mp.put('w', ".--");
        mp.put('x', "-..-");
        mp.put('y', "-.--");
        mp.put('z', "--..");
        if (words.length == 1)
            return 1;

        for (int i = 0; i < words.length; i++) {
            String text = "";
            for (int j = 0; j < words[i].length(); j++) {

                text += mp.get(words[i].charAt(j));
            }
            words[i] = text;

        }
        return (int)Arrays.stream(words)
                .distinct()
                .count();
    }
}
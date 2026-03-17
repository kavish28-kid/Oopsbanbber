public class OOPSBannerAppUC7 {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            line.append(O.getPattern()[i]).append("   ")
                .append(O.getPattern()[i]).append("   ")
                .append(P.getPattern()[i]).append("   ")
                .append(S.getPattern()[i]);
            banner[i] = line.toString();
        }

        for (String row : banner) {
            System.out.println(row);
        }
    }
}
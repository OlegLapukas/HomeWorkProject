package JavaRushWork;

import java.util.ArrayList;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");

        System.out.println(detectAllWords(crossword, "home", "same"));
        //up
        System.out.println(detectAllWords(crossword, "luf"));

        //down
        System.out.println(detectAllWords(crossword, "ful"));

        //left
        System.out.println(detectAllWords(crossword, "edf"));

        //right
        System.out.println(detectAllWords(crossword, "fde"));

        //UpLeft
        System.out.println(detectAllWords(crossword, "gsf"));

        //Upright
        System.out.println(detectAllWords(crossword, "lse"));

        //DownLeft
        System.out.println(detectAllWords(crossword, "esl"));

        //Downright
        System.out.println(detectAllWords(crossword, "fsg"));
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {

        List<Word> foundWords = new ArrayList<>();

        for (String s : words) {

            int sX = 0; // i - gor/строка
            int sY = 0; // j - ver/столбец
            int eX;
            int eY;

            boolean isFound = false;

            char[] c = s.toCharArray();

            do {
                int indexNumber = 1;

                int[] startIndex = foundStartIndex(sX, sY, crossword, c[indexNumber - 1]);
                sX = startIndex[0];
                sY = startIndex[1];

                //up
                if (!isFound) {
                    for (int i = sX - 1; i >= 0; i--) {
                        if (indexNumber == c.length - 1) {
                            if (crossword[i][sY] == c[indexNumber]) {
                                eX = i;
                                eY = sY;
                                Word w = new Word(s);
                                w.setStartPoint(sY, sX);
                                w.setEndPoint(eY, eX);
                                foundWords.add(w);
                                isFound = true;
                            } else {
                                indexNumber = 1;
                            }
                            break;
                        } else if (crossword[i][sY] == c[indexNumber]) {
                            indexNumber++;
                        } else if (crossword[i][sY] != c[indexNumber]) {
                            indexNumber = 1;
                            break;
                        }
                    }
                }

                //down
                if (!isFound) {
                    for (int i = sX + 1; i < crossword.length; i++) {
                        if (indexNumber == c.length - 1) {
                            if (crossword[i][sY] == c[indexNumber]) {
                                eX = i;
                                eY = sY;
                                Word w = new Word(s);
                                w.setStartPoint(sY, sX);
                                w.setEndPoint(eY, eX);
                                foundWords.add(w);
                                isFound = true;
                            } else {
                                indexNumber = 1;
                            }
                            break;
                        } else if (crossword[i][sY] == c[indexNumber]) {
                            indexNumber++;
                        } else if (crossword[i][sY] != c[indexNumber]) {
                            indexNumber = 1;
                            break;
                        }
                    }
                }

                //left
                if (!isFound) {
                    for (int i = sY - 1; i >= 0; i--) {
                        if (indexNumber == c.length - 1) {
                            if (crossword[sX][i] == c[indexNumber]) {
                                eX = sX;
                                eY = i;
                                Word w = new Word(s);
                                w.setStartPoint(sY, sX);
                                w.setEndPoint(eY, eX);
                                foundWords.add(w);
                                isFound = true;
                            } else {
                                indexNumber = 1;
                            }
                            break;
                        } else if (crossword[sX][i] == c[indexNumber]) {
                            indexNumber++;
                        } else if (crossword[sX][i] != c[indexNumber]) {
                            indexNumber = 1;
                            break;
                        }
                    }
                }

                //right
                if (!isFound) {
                    for (int i = sY + 1; i < crossword[sX].length; i++) {
                        if (indexNumber == c.length - 1) {
                            if (crossword[sX][i] == c[indexNumber]) {
                                eX = sX;
                                eY = i;
                                Word w = new Word(s);
                                w.setStartPoint(sY, sX);
                                w.setEndPoint(eY, eX);
                                foundWords.add(w);
                                isFound = true;
                            } else {
                                indexNumber = 1;
                            }
                            break;
                        } else if (crossword[sX][i] == c[indexNumber]) {
                            indexNumber++;
                        } else if (crossword[sX][i] != c[indexNumber]) {
                            indexNumber = 1;
                            break;
                        }
                    }
                }

                //UpAndLeft
                if (!isFound) {
                    for (int i = sX - 1, j = sY - 1; i >= 0; i--, j--) {
                        if (j >= 0) {
                            if (indexNumber == c.length - 1) {
                                if (crossword[i][j] == c[indexNumber]) {
                                    eX = i;
                                    eY = j;
                                    Word w = new Word(s);
                                    w.setStartPoint(sY, sX);
                                    w.setEndPoint(eY, eX);
                                    foundWords.add(w);
                                    isFound = true;
                                } else {
                                    indexNumber = 1;
                                }
                                break;
                            } else if (crossword[i][j] == c[indexNumber]) {
                                indexNumber++;
                            } else if (crossword[i][j] != c[indexNumber]) {
                                indexNumber = 1;
                                break;
                            }
                        } else {
                            indexNumber = 1;
                            break;
                        }

                    }
                }

                //UpAndRight
                if (!isFound) {
                    for (int i = sX - 1, j = sY + 1; i >= 0; i--, j++) {
                        if (j < crossword[i].length) {
                            if (indexNumber == c.length - 1) {
                                if (crossword[i][j] == c[indexNumber]) {
                                    eX = i;
                                    eY = j;
                                    Word w = new Word(s);
                                    w.setStartPoint(sY, sX);
                                    w.setEndPoint(eY, eX);
                                    foundWords.add(w);
                                    isFound = true;
                                } else {
                                    indexNumber = 1;
                                }
                                break;
                            } else if (crossword[i][j] == c[indexNumber]) {
                                indexNumber++;
                            } else if (crossword[i][j] != c[indexNumber]) {
                                indexNumber = 1;
                                break;
                            }
                        } else {
                            indexNumber = 1;
                            break;
                        }
                    }
                }

                //downAndLeft
                if (!isFound) {
                    for (int i = sX + 1, j = sY - 1; i < crossword.length; i++, j--) {
                        if (j >= 0) {
                            if (indexNumber == c.length - 1) {
                                if (crossword[i][j] == c[indexNumber]) {
                                    eX = i;
                                    eY = j;
                                    Word w = new Word(s);
                                    w.setStartPoint(sY, sX);
                                    w.setEndPoint(eY, eX);
                                    foundWords.add(w);
                                    isFound = true;
                                } else {
                                    indexNumber = 1;
                                }
                                break;
                            } else if (crossword[i][j] == c[indexNumber]) {
                                indexNumber++;
                            } else if (crossword[i][j] != c[indexNumber]) {
                                indexNumber = 1;
                                break;
                            }
                        } else {
                            indexNumber = 1;
                            break;
                        }
                    }
                }

                //downAndRight
                if (!isFound) {
                    for (int i = sX + 1, j = sY + 1; i < crossword.length; i++, j++) {
                        if (j < crossword[i].length) {
                            if (indexNumber == c.length - 1) {
                                if (crossword[i][j] == c[indexNumber]) {
                                    eX = i;
                                    eY = j;
                                    Word w = new Word(s);
                                    w.setStartPoint(sY, sX);
                                    w.setEndPoint(eY, eX);
                                    foundWords.add(w);
                                    isFound = true;
                                } else {
                                    indexNumber = 1;
                                }
                                break;
                            } else if (crossword[i][j] == c[indexNumber]) {
                                indexNumber++;
                            } else if (crossword[i][j] != c[indexNumber]) {
                                indexNumber = 1;
                                break;
                            }
                        } else {
                            indexNumber = 1;
                            break;
                        }
                    }
                }
                sY += 1;
            } while (!isFound);
        }
        return foundWords;

    }

    private static int[] foundStartIndex(int x, int y, int[][] deepArray, char c) {
        for (int i = x; i < deepArray.length; i++) {
            for (int j = y; j < deepArray[i].length; j++) {
                if (deepArray[i][j] == c) {
                    return new int[]{i, j};
                }
            }
            y = 0;
        }
        return new int[]{x, y};
    }


    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
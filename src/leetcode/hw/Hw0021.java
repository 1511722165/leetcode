package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw0021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pwd;
        StringBuilder sb = new StringBuilder();
        while ((pwd = br.readLine()) != null) {
            char[] chars = pwd.toCharArray();
            for (char c : chars) {
                if (c >= '0' && c <= '9') {
                    sb.append(c);
                }
                if (c >= 'a' && c <= 'z') {
                    switch (c) {
                        case 'a':
                            sb.append(2);
                            break;
                        case 'b':
                            sb.append(2);
                            break;
                        case 'c':
                            sb.append(2);
                            break;
                        case 'd':
                            sb.append(3);
                            break;
                        case 'e':
                            sb.append(3);
                            break;
                        case 'f':
                            sb.append(3);
                            break;
                        case 'g':
                            sb.append(4);
                            break;
                        case 'h':
                            sb.append(4);
                            break;
                        case 'i':
                            sb.append(4);
                            break;
                        case 'j':
                            sb.append(5);
                            break;
                        case 'k':
                            sb.append(5);
                            break;
                        case 'l':
                            sb.append(5);
                            break;
                        case 'm':
                            sb.append(6);
                            break;
                        case 'n':
                            sb.append(6);
                            break;
                        case 'o':
                            sb.append(6);
                            break;
                        case 'p':
                            sb.append(7);
                            break;
                        case 'q':
                            sb.append(7);
                            break;
                        case 'r':
                            sb.append(7);
                            break;
                        case 's':
                            sb.append(7);
                            break;
                        case 't':
                            sb.append(8);
                            break;
                        case 'u':
                            sb.append(8);
                            break;
                        case 'v':
                            sb.append(8);
                            break;
                        case 'w':
                            sb.append(9);
                            break;
                        case 'x':
                            sb.append(9);
                            break;
                        case 'y':
                            sb.append(9);
                            break;
                        case 'z':
                            sb.append(9);
                            break;
                        default:
                            ;
                    }
                }
                if (c >= 'A' && c < 'Z') {
                    sb.append((char) (c + 33));
                }
                if (c == 'Z') {
                    sb.append('a');
                }
            }
            System.out.println(sb.toString());

        }

    }
}

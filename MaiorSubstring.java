package dio.resolucoes;

/**
*Desafio
* Encontre a maior substring comum entre as duas strings informadas. 
* A substring pode ser qualquer parte da string, inclusive ela toda. 
* Se n�o houver subseq��ncia comum, a sa�da deve ser �0�. A compara��o � case sensitive ('x' != 'X').
* 
*Entrada
* A entrada cont�m v�rios casos de teste. 
* Cada caso de teste � composto por duas linhas, cada uma contendo uma string. 
* Ambas strings de entrada cont�m entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espa�o ' '), 
* inclusive, ou no m�nimo uma letra ('A'-'Z','a'-'z').
*
*Sa�da
* O tamanho da maior subsequ�ncia comum entre as duas Strings.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaiorSubstring {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String palavra1, palavra2, max, min; // declare suas variaveis aqui
		while ((palavra1 = in.readLine()) != null) { // complete seu c�digo
			palavra2 = in.readLine();
			if (palavra1.length() > palavra2.length()) {
				max = palavra1;
				min = palavra2;
			} else {
				max = palavra2;
				min = palavra1;
			}
			int minLength = min.length();
			int maxS = minLength;
			boolean f = true;
			while (maxS > 0 && f) { // altere as variaveis, se achar necessario
				int diff = minLength - maxS;
				for (int i = 0; i <= diff; i++) { // complete o laco de repeticao
					if (max.contains(min.substring(i, i + maxS))) {
						f = false;
						maxS++;
						break;
					}
				}
				maxS--;
			}
			System.out.println(maxS);
		}
		out.close();
	}

}
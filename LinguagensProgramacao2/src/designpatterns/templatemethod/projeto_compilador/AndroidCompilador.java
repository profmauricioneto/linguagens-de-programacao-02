
package designpatterns.templatemethod.projeto_compilador;

/**
 *
 * @author maumneto
 */
public class AndroidCompilador extends Compilador {
    public AndroidCompilador(){}
    @Override
    public void codigoFonte() {
        System.out.println("Gerando Código Java.");
    }

    @Override
    public void compilarParaObjeto() {
        System.out.println("Gerando código ByteCode.");
    }

    @Override
    public void executar() {
        System.out.println("Executando código Android.");
    }    
}

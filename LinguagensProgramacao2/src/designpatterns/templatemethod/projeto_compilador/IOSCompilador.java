
package designpatterns.templatemethod.projeto_compilador;

/**
 *
 * @author maumneto
 */
public class IOSCompilador extends Compilador {
    public IOSCompilador() {
    }
    @Override
    public void codigoFonte() {
        System.out.println("Gerando Código Swift ou Objective C.");
    }

    @Override
    public void compilarParaObjeto() {
        System.out.println("Gerando código intermediário do Swift.");
    }

    @Override
    public void executar() {
        System.out.println("Executando código IOS");
    }
}

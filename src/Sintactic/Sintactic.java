package Sintactic;

import Atom.Atom;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Vector;

/**
 *
 * @author Miki
 */
public class Sintactic {

    private Vector<Atom> atoms;
    private int position;
    

    public Sintactic(Vector<Atom> atoms) {
        this.atoms = atoms;
        position = 0;
    }

    public boolean verify() {
        return program();

    }

    private boolean program() {
        if (!(atoms.get(position++).toString().equals("program"))) {
            return false;
        }
        if (!(atoms.get(position++).getClass().toString().equals("Identificator"))) {
            return false;
        }
         if (!(atoms.get(position++).toString().equals(";"))) {
             return false;
         }
        
        return block();
        
        
        
    }

    private boolean block() {
        if(!(sectiuneConst())){
             return false;
        }
        if(!(sectiuneVar())){
            return false;
        }
        if(!(sectiuneDeclSubprogram())){
            return false;
        }
        if(!(instructiuniComp())){
            return false;
        }
        
        return true;
    }

    private boolean sectiuneConst() {
        int aux = position;
        if (atoms.get(aux++).toString().equals("const")) {
            return listaDeclConst(aux);
        }
        
        return true;
    }

    private boolean sectiuneVar() {
       if (atoms.get(position).toString().equals("var")) {
            listaDeclVar();
        }
        
        return true;
    }

    private boolean sectiuneDeclSubprogram() {
        listaDeclSubprogram();
        
        return true;        
    }

    private boolean instructiuniComp() {
        
    }

    private boolean listaDeclConst(int aux) {
        if(declarConst()) {
            return listaDeclConst(aux);
        }
        
        return true;
        
    }

    private boolean listaDeclVar() {
        if(declarVar()) {
            return true;
        }
        return listaDeclVar();
    }

    private boolean declarConst() {
        int aux = position;
        
        if(!(atoms.get(aux++).getClass().equals("Identificator"))) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals("="))) {
            return false;
        }
        if(!expresieStatica(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(";"))) {
            return false;
        }
        
        return expresieStatica(aux);
        
    }

    private boolean expresieStatica(int aux) {
        if(termenStatic(aux)) {
            return true;
        }
        expresieStatica(aux);
        opAd(aux);
        termenStatic(aux);
        
        return true;
    }

    private boolean termenStatic(int aux) {
        if(factorStatic(aux)) {
            return true;
        }
        
        termenStatic(aux);
        opMul(aux);
        factorStatic(aux);
        
        return true;
    }

    private boolean opAd(int aux) {
        if(!(atoms.get(aux).toString().equals("+"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("-"))) {
            return false;
        }
        
        return true;
    }

    private boolean factorStatic(int aux) {
        if(atoms.get(aux).getClass().equals("Identificator")) {
            return true;
        }
        if(constanta(aux)) {
            return true;
        }
        if(atoms.get(aux).toString().equals("(")) {
            expresieStatica(aux);
            if(atoms.get(aux).toString().equals(")")) {
                return true;
            }
        }
        
        return true;
    }

    private boolean opMul(int aux) {
        if(!(atoms.get(aux).toString().equals("*"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("/"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("div"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("mod"))) {
            return false;
        }
        
        return true;
    }

    private boolean constanta(int aux) {
        if(!(atoms.get(aux).getClass().equals("ConstNum"))) {
            return false;
        }
        if(!(atoms.get(aux).getClass().equals("Identificator"))) {
            return false;
        }
        
        return true;
    }

    private boolean declarVar() {
        int aux = position;
        
        if(!listaId(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(":"))) {
            return false;
        }
        if(!tip(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(";"))) {
            return false;
        }
        
        return true;
    }
    
    private boolean listaId(int aux) {
        if(!(atoms.get(aux).getClass().equals("Identificator"))) {
            return false;
        }
        
        if(!listaId(aux)) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals(","))) {
            return false;
        }
        if(!(atoms.get(aux).getClass().equals("Identificator"))) {
            return false;
        }
        
        return true;
    }

    private boolean tip(int aux) {
        if(!tipSimplu(aux)) {
            return false;
        }
        if(!tipTablou(aux)) {
            return false;
        }
        if(!tipStruct(aux)) {
            return false;
        }
        
        return true;
    }

    private boolean tipSimplu(int aux) {
        if(!(atoms.get(aux).toString().equals("integer"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("real"))) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("char"))) {
            return false;
        }
        
        return true;
        
    }

    private boolean tipTablou(int aux) {
        if(!(atoms.get(aux++).toString().equals("array"))) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals("["))) {
            return false;
        }
        if(!expresieStatica(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(".."))) {
            return false;
        }
        if(!expresieStatica(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals("of"))) {
            return false;
        }
        if(!tipSimplu(aux)) {
            return false;
        }
        
        return true;
    }

    private boolean tipStruct(int aux) {
        if(!(atoms.get(aux).toString().equals("record"))) {
            return false;
        }
        if(!listaCamp(aux)) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals("end"))) {
            return false;
        }
        
        return true;
    }

    private boolean listaCamp(int aux) {
        if(!declSimpla(aux)) {
            return false;
        }
        if(!listaCamp(aux)) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals(";"))) {
            return false;
        }
        if(!declSimpla(aux)) {
            return false;
        }
        
        return true;
    }

    private boolean declSimpla(int aux) {
        if(!listaId(aux)) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals(";"))) {
            return false;
        }
        if(!declSimpla(aux)) {
            return false;
        }
        
        return true;
    }

    private boolean listaDeclSubprogram() {
        if(declSubprgram()) {
            return true;
        }
        return listaDeclSubprogram();
    }

    private boolean declSubprgram() {
        int aux = position;
        
        if(!declarFunctie (aux) && declarProcedura(aux)) {
            return false;
        }
        
        return true;
    }

    private boolean declarFunctie(int aux) {
        
        if(!(atoms.get(aux++).toString().equals("function"))) {
            return false;
        }
        if(!antetSubprog(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(":"))) {
            return false;
        }
        if(!tipSimplu(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(";"))) {
            return false;
        }
        if(!block()) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(";"))) {
            return false;
        }
        
        return true;
    }

    private boolean declarProcedura(int aux) {
       if(!(atoms.get(aux++).toString().equals("function"))) {
            return false;
        }
        if(!antetSubprog(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(";"))) {
            return false;
        }
        if(!block()) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(";"))) {
            return false;
        }
        
        return true;
    }

    private boolean antetSubprog(int aux) {
        if(!(atoms.get(aux++).getClass().equals("Identificator"))) {
            return false;
        }
        
        if(!paramForm(aux++)) {
            return false;
        }
        
        return true;
    }

    private boolean paramForm(int aux) {
        if(!(atoms.get(aux++).toString().equals("("))) {
            return false;
        }
        if(!listaParamForm(aux)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(")"))) {
            return false;
        }
        
        return true;
    }

    private boolean listaParamForm(int aux) {
        
        if(!declarPar(aux) && !listaParamForm(aux)) {
            return false;
        }
        if(!(atoms.get(aux).toString().equals(";"))) {
            return false;
        }
        if(!declarPar(aux)) {
            return false;
        }
        
        return true;
        
    }

    private boolean declarPar(int aux) {
        if(!declarSimpla(aux) && !(atoms.get(aux).toString().equals("var")) && !declarSimpla(aux)) {
            return false;
        }
        return true;
    }

    private boolean declarSimpla(int aux) {
        if(!listaId(aux++)) {
            return false;
        }
        if(!(atoms.get(aux++).toString().equals(":"))) {
            return false;
        }
        if(!tipSimplu(aux++)) {
            return false;
        }
        
        return true;
    }

    
}

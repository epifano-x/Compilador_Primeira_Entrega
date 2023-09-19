/* Compilador.java */
/* Generated By:JavaCC: Do not edit this line. Compilador.java */
public class Compilador implements CompiladorConstants {
  public static void main(String args []) throws ParseException
  {
    Compilador parser = new Compilador(System.in);
    while (true)
    {
      System.out.println("ESCREVE LOGO CARAMBA \n- >");

      try
      {
        Compilador.Start();
      }
      catch (Exception e)
      {
        System.out.println("NOK.");
        System.out.println(e.getMessage());
        Compilador.ReInit(System.in);
      }
      catch (Error e)
      {
        System.out.println("Oops.");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  static final public void Start() throws ParseException {
    label_1:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_1;
      }
      Statement();
    }
    jj_consume_token(EOF_TOKEN);
}

  static final public void Statement() throws ParseException {
    if (jj_2_2(2)) {
      VariableDeclaration();
    } else if (jj_2_3(2)) {
      Assignment();
    } else if (jj_2_4(2)) {
      Conditional();
    } else if (jj_2_5(2)) {
      Loop();
    } else if (jj_2_6(2)) {
      MultiVariableAssignment();
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
    if (jj_2_10(2)) {
      jj_consume_token(SEMICOLON);
    } else {
      if (jj_2_9(2)) {
        if (jj_2_7(2)) {
          Else();
        } else if (jj_2_8(2)) {
          ElseIf();
        } else {
          jj_consume_token(-1);
          throw new ParseException();
        }
      } else {
        ;
      }
    }
}

  static final public void VariableDeclaration() throws ParseException {
    Type();
    VariableDeclarations();
}

  static final public void VariableDeclarations() throws ParseException {
    jj_consume_token(ID);
    if (jj_2_11(2)) {
      jj_consume_token(ASSIGN);
      Expression();
    } else {
      ;
    }
    label_2:
    while (true) {
      if (jj_2_12(2)) {
        ;
      } else {
        break label_2;
      }
      jj_consume_token(COMMA);
      jj_consume_token(ID);
      if (jj_2_13(2)) {
        jj_consume_token(ASSIGN);
        Expression();
      } else {
        ;
      }
    }
}

  static final public void MultiVariableAssignment() throws ParseException {
    jj_consume_token(ID);
    label_3:
    while (true) {
      jj_consume_token(COMMA);
      jj_consume_token(ID);
      if (jj_2_14(2)) {
        ;
      } else {
        break label_3;
      }
    }
    jj_consume_token(ASSIGN);
    Expression();
}

  static final public void Assignment() throws ParseException {
    jj_consume_token(ID);
    jj_consume_token(ASSIGN);
    Expression();
}

  static final public void Conditional() throws ParseException {
    jj_consume_token(IF);
    jj_consume_token(OPEN_PAREN);
    Expression();
    jj_consume_token(CLOSE_PAREN);
    jj_consume_token(OPEN_CURLY);
    label_4:
    while (true) {
      if (jj_2_15(2)) {
        ;
      } else {
        break label_4;
      }
      Statement();
    }
    jj_consume_token(CLOSE_CURLY);
    if (jj_2_18(2)) {
      if (jj_2_16(2)) {
        Else();
      } else if (jj_2_17(2)) {
        ElseIf();
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    } else {
      ;
    }
}

  static final public void Else() throws ParseException {
    jj_consume_token(ELSE);
    jj_consume_token(OPEN_CURLY);
    label_5:
    while (true) {
      if (jj_2_19(2)) {
        ;
      } else {
        break label_5;
      }
      Statement();
    }
    jj_consume_token(CLOSE_CURLY);
    if (jj_2_22(2)) {
      if (jj_2_20(2)) {
        Else();
      } else if (jj_2_21(2)) {
        ElseIf();
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    } else {
      ;
    }
}

  static final public void ElseIf() throws ParseException {
    jj_consume_token(ELSEIF);
    jj_consume_token(OPEN_PAREN);
    Expression();
    jj_consume_token(CLOSE_PAREN);
    jj_consume_token(OPEN_CURLY);
    label_6:
    while (true) {
      if (jj_2_23(2)) {
        ;
      } else {
        break label_6;
      }
      Statement();
    }
    jj_consume_token(CLOSE_CURLY);
    if (jj_2_26(2)) {
      if (jj_2_24(2)) {
        Else();
      } else if (jj_2_25(2)) {
        ElseIf();
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    } else {
      ;
    }
}

  static final public void Loop() throws ParseException {
    if (jj_2_27(2)) {
      jj_consume_token(WHILE);
    } else if (jj_2_28(2)) {
      jj_consume_token(FOR);
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(OPEN_PAREN);
    Expression();
    jj_consume_token(CLOSE_PAREN);
    jj_consume_token(OPEN_CURLY);
    label_7:
    while (true) {
      if (jj_2_29(2)) {
        ;
      } else {
        break label_7;
      }
      Statement();
    }
    jj_consume_token(CLOSE_CURLY);
}

  static final public void Type() throws ParseException {
    if (jj_2_30(2)) {
      jj_consume_token(INT);
    } else if (jj_2_31(2)) {
      jj_consume_token(FLOAT);
    } else if (jj_2_32(2)) {
      jj_consume_token(STRING);
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void Expression() throws ParseException {
    OrExpression();
}

  static final public void OrExpression() throws ParseException {
    AndExpression();
    label_8:
    while (true) {
      if (jj_2_33(2)) {
        ;
      } else {
        break label_8;
      }
      jj_consume_token(OR);
      AndExpression();
    }
}

  static final public void AndExpression() throws ParseException {
    EqualityExpression();
    label_9:
    while (true) {
      if (jj_2_34(2)) {
        ;
      } else {
        break label_9;
      }
      jj_consume_token(AND);
      EqualityExpression();
    }
}

  static final public void EqualityExpression() throws ParseException {
    RelationalExpression();
    label_10:
    while (true) {
      if (jj_2_35(2)) {
        ;
      } else {
        break label_10;
      }
      jj_consume_token(EQUALS);
      RelationalExpression();
    }
}

  static final public void RelationalExpression() throws ParseException {
    AdditiveExpression();
    label_11:
    while (true) {
      if (jj_2_36(2)) {
        ;
      } else {
        break label_11;
      }
      if (jj_2_37(2)) {
        jj_consume_token(26);
      } else if (jj_2_38(2)) {
        jj_consume_token(27);
      } else if (jj_2_39(2)) {
        jj_consume_token(EQUALS);
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
      AdditiveExpression();
    }
}

  static final public void AdditiveExpression() throws ParseException {
    Term();
    label_12:
    while (true) {
      if (jj_2_40(2)) {
        ;
      } else {
        break label_12;
      }
      if (jj_2_41(2)) {
        jj_consume_token(28);
      } else if (jj_2_42(2)) {
        jj_consume_token(29);
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
      Term();
    }
}

  static final public void Term() throws ParseException {
    Factor();
    label_13:
    while (true) {
      if (jj_2_43(2)) {
        ;
      } else {
        break label_13;
      }
      if (jj_2_44(2)) {
        jj_consume_token(30);
      } else if (jj_2_45(2)) {
        jj_consume_token(31);
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
      Factor();
    }
}

  static final public void Factor() throws ParseException {
    if (jj_2_46(2)) {
      jj_consume_token(NUM);
    } else if (jj_2_47(2)) {
      jj_consume_token(ID);
    } else if (jj_2_48(2)) {
      jj_consume_token(OPEN_PAREN);
      Expression();
      jj_consume_token(CLOSE_PAREN);
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_1()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_2()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_3()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_4()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_5()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_6()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_2_7(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_7()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  static private boolean jj_2_8(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_8()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  static private boolean jj_2_9(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_9()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  static private boolean jj_2_10(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_10()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  static private boolean jj_2_11(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_11()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  static private boolean jj_2_12(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_12()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  static private boolean jj_2_13(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_13()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  static private boolean jj_2_14(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_14()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  static private boolean jj_2_15(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_15()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(14, xla); }
  }

  static private boolean jj_2_16(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_16()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(15, xla); }
  }

  static private boolean jj_2_17(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_17()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(16, xla); }
  }

  static private boolean jj_2_18(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_18()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(17, xla); }
  }

  static private boolean jj_2_19(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_19()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(18, xla); }
  }

  static private boolean jj_2_20(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_20()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(19, xla); }
  }

  static private boolean jj_2_21(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_21()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(20, xla); }
  }

  static private boolean jj_2_22(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_22()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(21, xla); }
  }

  static private boolean jj_2_23(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_23()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(22, xla); }
  }

  static private boolean jj_2_24(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_24()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(23, xla); }
  }

  static private boolean jj_2_25(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_25()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(24, xla); }
  }

  static private boolean jj_2_26(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_26()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(25, xla); }
  }

  static private boolean jj_2_27(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_27()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(26, xla); }
  }

  static private boolean jj_2_28(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_28()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(27, xla); }
  }

  static private boolean jj_2_29(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_29()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(28, xla); }
  }

  static private boolean jj_2_30(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_30()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(29, xla); }
  }

  static private boolean jj_2_31(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_31()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(30, xla); }
  }

  static private boolean jj_2_32(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_32()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(31, xla); }
  }

  static private boolean jj_2_33(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_33()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(32, xla); }
  }

  static private boolean jj_2_34(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_34()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(33, xla); }
  }

  static private boolean jj_2_35(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_35()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(34, xla); }
  }

  static private boolean jj_2_36(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_36()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(35, xla); }
  }

  static private boolean jj_2_37(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_37()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(36, xla); }
  }

  static private boolean jj_2_38(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_38()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(37, xla); }
  }

  static private boolean jj_2_39(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_39()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(38, xla); }
  }

  static private boolean jj_2_40(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_40()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(39, xla); }
  }

  static private boolean jj_2_41(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_41()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(40, xla); }
  }

  static private boolean jj_2_42(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_42()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(41, xla); }
  }

  static private boolean jj_2_43(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_43()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(42, xla); }
  }

  static private boolean jj_2_44(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_44()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(43, xla); }
  }

  static private boolean jj_2_45(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_45()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(44, xla); }
  }

  static private boolean jj_2_46(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_46()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(45, xla); }
  }

  static private boolean jj_2_47(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_47()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(46, xla); }
  }

  static private boolean jj_2_48(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_48()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(47, xla); }
  }

  static private boolean jj_3R_AdditiveExpression_183_5_26()
 {
    if (jj_3R_Term_189_5_27()) return true;
    return false;
  }

  static private boolean jj_3R_VariableDeclaration_88_5_15()
 {
    if (jj_3R_Type_147_5_29()) return true;
    if (jj_3R_VariableDeclarations_94_5_30()) return true;
    return false;
  }

  static private boolean jj_3_10()
 {
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  static private boolean jj_3R_RelationalExpression_177_5_25()
 {
    if (jj_3R_AdditiveExpression_183_5_26()) return true;
    return false;
  }

  static private boolean jj_3_2()
 {
    if (jj_3R_VariableDeclaration_88_5_15()) return true;
    return false;
  }

  static private boolean jj_3_33()
 {
    if (jj_scan_token(OR)) return true;
    if (jj_3R_AndExpression_165_5_23()) return true;
    return false;
  }

  static private boolean jj_3R_Statement_81_5_14()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3_5()) {
    jj_scanpos = xsp;
    if (jj_3_6()) return true;
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_EqualityExpression_171_5_24()
 {
    if (jj_3R_RelationalExpression_177_5_25()) return true;
    return false;
  }

  static private boolean jj_3_1()
 {
    if (jj_3R_Statement_81_5_14()) return true;
    return false;
  }

  static private boolean jj_3_32()
 {
    if (jj_scan_token(STRING)) return true;
    return false;
  }

  static private boolean jj_3R_AndExpression_165_5_23()
 {
    if (jj_3R_EqualityExpression_171_5_24()) return true;
    return false;
  }

  static private boolean jj_3R_OrExpression_159_5_31()
 {
    if (jj_3R_AndExpression_165_5_23()) return true;
    return false;
  }

  static private boolean jj_3_31()
 {
    if (jj_scan_token(FLOAT)) return true;
    return false;
  }

  static private boolean jj_3R_Expression_153_5_22()
 {
    if (jj_3R_OrExpression_159_5_31()) return true;
    return false;
  }

  static private boolean jj_3_28()
 {
    if (jj_scan_token(FOR)) return true;
    return false;
  }

  static private boolean jj_3_30()
 {
    if (jj_scan_token(INT)) return true;
    return false;
  }

  static private boolean jj_3R_Type_147_5_29()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_30()) {
    jj_scanpos = xsp;
    if (jj_3_31()) {
    jj_scanpos = xsp;
    if (jj_3_32()) return true;
    }
    }
    return false;
  }

  static private boolean jj_3_6()
 {
    if (jj_3R_MultiVariableAssignment_100_5_19()) return true;
    return false;
  }

  static private boolean jj_3_25()
 {
    if (jj_3R_ElseIf_129_5_21()) return true;
    return false;
  }

  static private boolean jj_3_29()
 {
    if (jj_3R_Statement_81_5_14()) return true;
    return false;
  }

  static private boolean jj_3_27()
 {
    if (jj_scan_token(WHILE)) return true;
    return false;
  }

  static private boolean jj_3R_Loop_139_5_18()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_27()) {
    jj_scanpos = xsp;
    if (jj_3_28()) return true;
    }
    if (jj_scan_token(OPEN_PAREN)) return true;
    return false;
  }

  static private boolean jj_3_5()
 {
    if (jj_3R_Loop_139_5_18()) return true;
    return false;
  }

  static private boolean jj_3_21()
 {
    if (jj_3R_ElseIf_129_5_21()) return true;
    return false;
  }

  static private boolean jj_3_24()
 {
    if (jj_3R_Else_120_5_20()) return true;
    return false;
  }

  static private boolean jj_3_26()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_24()) {
    jj_scanpos = xsp;
    if (jj_3_25()) return true;
    }
    return false;
  }

  static private boolean jj_3_13()
 {
    if (jj_scan_token(ASSIGN)) return true;
    if (jj_3R_Expression_153_5_22()) return true;
    return false;
  }

  static private boolean jj_3_23()
 {
    if (jj_3R_Statement_81_5_14()) return true;
    return false;
  }

  static private boolean jj_3R_ElseIf_129_5_21()
 {
    if (jj_scan_token(ELSEIF)) return true;
    if (jj_scan_token(OPEN_PAREN)) return true;
    return false;
  }

  static private boolean jj_3_17()
 {
    if (jj_3R_ElseIf_129_5_21()) return true;
    return false;
  }

  static private boolean jj_3_20()
 {
    if (jj_3R_Else_120_5_20()) return true;
    return false;
  }

  static private boolean jj_3_22()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_20()) {
    jj_scanpos = xsp;
    if (jj_3_21()) return true;
    }
    return false;
  }

  static private boolean jj_3_12()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_scan_token(ID)) return true;
    return false;
  }

  static private boolean jj_3_19()
 {
    if (jj_3R_Statement_81_5_14()) return true;
    return false;
  }

  static private boolean jj_3_4()
 {
    if (jj_3R_Conditional_111_5_17()) return true;
    return false;
  }

  static private boolean jj_3R_Else_120_5_20()
 {
    if (jj_scan_token(ELSE)) return true;
    if (jj_scan_token(OPEN_CURLY)) return true;
    return false;
  }

  static private boolean jj_3_39()
 {
    if (jj_scan_token(EQUALS)) return true;
    return false;
  }

  static private boolean jj_3_48()
 {
    if (jj_scan_token(OPEN_PAREN)) return true;
    if (jj_3R_Expression_153_5_22()) return true;
    return false;
  }

  static private boolean jj_3_16()
 {
    if (jj_3R_Else_120_5_20()) return true;
    return false;
  }

  static private boolean jj_3_18()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_16()) {
    jj_scanpos = xsp;
    if (jj_3_17()) return true;
    }
    return false;
  }

  static private boolean jj_3_45()
 {
    if (jj_scan_token(31)) return true;
    return false;
  }

  static private boolean jj_3_38()
 {
    if (jj_scan_token(27)) return true;
    return false;
  }

  static private boolean jj_3_15()
 {
    if (jj_3R_Statement_81_5_14()) return true;
    return false;
  }

  static private boolean jj_3R_Conditional_111_5_17()
 {
    if (jj_scan_token(IF)) return true;
    if (jj_scan_token(OPEN_PAREN)) return true;
    return false;
  }

  static private boolean jj_3_47()
 {
    if (jj_scan_token(ID)) return true;
    return false;
  }

  static private boolean jj_3_44()
 {
    if (jj_scan_token(30)) return true;
    return false;
  }

  static private boolean jj_3_37()
 {
    if (jj_scan_token(26)) return true;
    return false;
  }

  static private boolean jj_3_14()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_scan_token(ID)) return true;
    return false;
  }

  static private boolean jj_3_8()
 {
    if (jj_3R_ElseIf_129_5_21()) return true;
    return false;
  }

  static private boolean jj_3_3()
 {
    if (jj_3R_Assignment_105_5_16()) return true;
    return false;
  }

  static private boolean jj_3R_Assignment_105_5_16()
 {
    if (jj_scan_token(ID)) return true;
    if (jj_scan_token(ASSIGN)) return true;
    return false;
  }

  static private boolean jj_3_43()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_44()) {
    jj_scanpos = xsp;
    if (jj_3_45()) return true;
    }
    if (jj_3R_Factor_195_5_28()) return true;
    return false;
  }

  static private boolean jj_3_42()
 {
    if (jj_scan_token(29)) return true;
    return false;
  }

  static private boolean jj_3_36()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_37()) {
    jj_scanpos = xsp;
    if (jj_3_38()) {
    jj_scanpos = xsp;
    if (jj_3_39()) return true;
    }
    }
    if (jj_3R_AdditiveExpression_183_5_26()) return true;
    return false;
  }

  static private boolean jj_3_35()
 {
    if (jj_scan_token(EQUALS)) return true;
    if (jj_3R_RelationalExpression_177_5_25()) return true;
    return false;
  }

  static private boolean jj_3R_Factor_195_5_28()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_46()) {
    jj_scanpos = xsp;
    if (jj_3_47()) {
    jj_scanpos = xsp;
    if (jj_3_48()) return true;
    }
    }
    return false;
  }

  static private boolean jj_3R_MultiVariableAssignment_100_5_19()
 {
    if (jj_scan_token(ID)) return true;
    Token xsp;
    if (jj_3_14()) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_14()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  static private boolean jj_3_46()
 {
    if (jj_scan_token(NUM)) return true;
    return false;
  }

  static private boolean jj_3_11()
 {
    if (jj_scan_token(ASSIGN)) return true;
    if (jj_3R_Expression_153_5_22()) return true;
    return false;
  }

  static private boolean jj_3_41()
 {
    if (jj_scan_token(28)) return true;
    return false;
  }

  static private boolean jj_3_9()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_7()) {
    jj_scanpos = xsp;
    if (jj_3_8()) return true;
    }
    return false;
  }

  static private boolean jj_3_7()
 {
    if (jj_3R_Else_120_5_20()) return true;
    return false;
  }

  static private boolean jj_3_40()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_41()) {
    jj_scanpos = xsp;
    if (jj_3_42()) return true;
    }
    if (jj_3R_Term_189_5_27()) return true;
    return false;
  }

  static private boolean jj_3R_VariableDeclarations_94_5_30()
 {
    if (jj_scan_token(ID)) return true;
    return false;
  }

  static private boolean jj_3R_Term_189_5_27()
 {
    if (jj_3R_Factor_195_5_28()) return true;
    return false;
  }

  static private boolean jj_3_34()
 {
    if (jj_scan_token(AND)) return true;
    if (jj_3R_EqualityExpression_171_5_24()) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CompiladorTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {};
	}
  static final private JJCalls[] jj_2_rtns = new JJCalls[48];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Compilador(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Compilador(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new CompiladorTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 0; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Compilador(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new CompiladorTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new CompiladorTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Compilador(CompiladorTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(CompiladorTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   if (++jj_gc > 100) {
		 jj_gc = 0;
		 for (int i = 0; i < jj_2_rtns.length; i++) {
		   JJCalls c = jj_2_rtns[i];
		   while (c != null) {
			 if (c.gen < jj_gen) c.first = null;
			 c = c.next;
		   }
		 }
	   }
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error {
    @Override
    public Throwable fillInStackTrace() {
      return this;
    }
  }
  static private final LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
	 if (jj_scanpos == jj_lastpos) {
	   jj_la--;
	   if (jj_scanpos.next == null) {
		 jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
	   } else {
		 jj_lastpos = jj_scanpos = jj_scanpos.next;
	   }
	 } else {
	   jj_scanpos = jj_scanpos.next;
	 }
	 if (jj_rescan) {
	   int i = 0; Token tok = token;
	   while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
	   if (tok != null) jj_add_error_token(kind, i);
	 }
	 if (jj_scanpos.kind != kind) return true;
	 if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
	 return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
	 if (pos >= 100) {
		return;
	 }

	 if (pos == jj_endpos + 1) {
	   jj_lasttokens[jj_endpos++] = kind;
	 } else if (jj_endpos != 0) {
	   jj_expentry = new int[jj_endpos];

	   for (int i = 0; i < jj_endpos; i++) {
		 jj_expentry[i] = jj_lasttokens[i];
	   }

	   for (int[] oldentry : jj_expentries) {
		 if (oldentry.length == jj_expentry.length) {
		   boolean isMatched = true;

		   for (int i = 0; i < jj_expentry.length; i++) {
			 if (oldentry[i] != jj_expentry[i]) {
			   isMatched = false;
			   break;
			 }

		   }
		   if (isMatched) {
			 jj_expentries.add(jj_expentry);
			 break;
		   }
		 }
	   }

	   if (pos != 0) {
		 jj_lasttokens[(jj_endpos = pos) - 1] = kind;
	   }
	 }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[32];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 0; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 32; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 jj_endpos = 0;
	 jj_rescan_token();
	 jj_add_error_token(0, 0);
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
	 jj_rescan = true;
	 for (int i = 0; i < 48; i++) {
	   try {
		 JJCalls p = jj_2_rtns[i];

		 do {
		   if (p.gen > jj_gen) {
			 jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
			 switch (i) {
			   case 0: jj_3_1(); break;
			   case 1: jj_3_2(); break;
			   case 2: jj_3_3(); break;
			   case 3: jj_3_4(); break;
			   case 4: jj_3_5(); break;
			   case 5: jj_3_6(); break;
			   case 6: jj_3_7(); break;
			   case 7: jj_3_8(); break;
			   case 8: jj_3_9(); break;
			   case 9: jj_3_10(); break;
			   case 10: jj_3_11(); break;
			   case 11: jj_3_12(); break;
			   case 12: jj_3_13(); break;
			   case 13: jj_3_14(); break;
			   case 14: jj_3_15(); break;
			   case 15: jj_3_16(); break;
			   case 16: jj_3_17(); break;
			   case 17: jj_3_18(); break;
			   case 18: jj_3_19(); break;
			   case 19: jj_3_20(); break;
			   case 20: jj_3_21(); break;
			   case 21: jj_3_22(); break;
			   case 22: jj_3_23(); break;
			   case 23: jj_3_24(); break;
			   case 24: jj_3_25(); break;
			   case 25: jj_3_26(); break;
			   case 26: jj_3_27(); break;
			   case 27: jj_3_28(); break;
			   case 28: jj_3_29(); break;
			   case 29: jj_3_30(); break;
			   case 30: jj_3_31(); break;
			   case 31: jj_3_32(); break;
			   case 32: jj_3_33(); break;
			   case 33: jj_3_34(); break;
			   case 34: jj_3_35(); break;
			   case 35: jj_3_36(); break;
			   case 36: jj_3_37(); break;
			   case 37: jj_3_38(); break;
			   case 38: jj_3_39(); break;
			   case 39: jj_3_40(); break;
			   case 40: jj_3_41(); break;
			   case 41: jj_3_42(); break;
			   case 42: jj_3_43(); break;
			   case 43: jj_3_44(); break;
			   case 44: jj_3_45(); break;
			   case 45: jj_3_46(); break;
			   case 46: jj_3_47(); break;
			   case 47: jj_3_48(); break;
			 }
		   }
		   p = p.next;
		 } while (p != null);

		 } catch(LookaheadSuccess ls) { }
	 }
	 jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
	 JJCalls p = jj_2_rtns[index];
	 while (p.gen > jj_gen) {
	   if (p.next == null) { p = p.next = new JJCalls(); break; }
	   p = p.next;
	 }

	 p.gen = jj_gen + xla - jj_la; 
	 p.first = token;
	 p.arg = xla;
  }

  static final class JJCalls {
	 int gen;
	 Token first;
	 int arg;
	 JJCalls next;
  }

}

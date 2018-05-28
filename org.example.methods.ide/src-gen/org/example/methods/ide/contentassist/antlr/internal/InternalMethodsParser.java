package org.example.methods.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.methods.services.MethodsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMethodsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'String'", "'void'", "'boolean'", "'public'", "'('", "')'", "'{'", "'}'", "';'", "'='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMethodsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMethodsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMethodsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMethods.g"; }


    	private MethodsGrammarAccess grammarAccess;

    	public void setGrammarAccess(MethodsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMethods.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMethods.g:54:1: ( ruleModel EOF )
            // InternalMethods.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMethods.g:62:1: ruleModel : ( ( rule__Model__MehtodsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:66:2: ( ( ( rule__Model__MehtodsAssignment )* ) )
            // InternalMethods.g:67:2: ( ( rule__Model__MehtodsAssignment )* )
            {
            // InternalMethods.g:67:2: ( ( rule__Model__MehtodsAssignment )* )
            // InternalMethods.g:68:3: ( rule__Model__MehtodsAssignment )*
            {
             before(grammarAccess.getModelAccess().getMehtodsAssignment()); 
            // InternalMethods.g:69:3: ( rule__Model__MehtodsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMethods.g:69:4: rule__Model__MehtodsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__MehtodsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMehtodsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMethod"
    // InternalMethods.g:78:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalMethods.g:79:1: ( ruleMethod EOF )
            // InternalMethods.g:80:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMethods.g:87:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:91:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalMethods.g:92:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalMethods.g:92:2: ( ( rule__Method__Group__0 ) )
            // InternalMethods.g:93:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalMethods.g:94:3: ( rule__Method__Group__0 )
            // InternalMethods.g:94:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalMethods.g:103:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMethods.g:104:1: ( ruleParameter EOF )
            // InternalMethods.g:105:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMethods.g:112:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:116:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMethods.g:117:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMethods.g:117:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMethods.g:118:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMethods.g:119:3: ( rule__Parameter__Group__0 )
            // InternalMethods.g:119:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAttribute"
    // InternalMethods.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMethods.g:129:1: ( ruleAttribute EOF )
            // InternalMethods.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMethods.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMethods.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMethods.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMethods.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMethods.g:144:3: ( rule__Attribute__Group__0 )
            // InternalMethods.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalMethods.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMethods.g:154:1: ( ruleType EOF )
            // InternalMethods.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMethods.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMethods.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMethods.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalMethods.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMethods.g:169:3: ( rule__Type__Alternatives )
            // InternalMethods.g:169:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleValue"
    // InternalMethods.g:178:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMethods.g:179:1: ( ruleValue EOF )
            // InternalMethods.g:180:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMethods.g:187:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:191:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMethods.g:192:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMethods.g:192:2: ( ( rule__Value__Alternatives ) )
            // InternalMethods.g:193:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMethods.g:194:3: ( rule__Value__Alternatives )
            // InternalMethods.g:194:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntType"
    // InternalMethods.g:203:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // InternalMethods.g:204:1: ( ruleIntType EOF )
            // InternalMethods.g:205:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntType();

            state._fsp--;

             after(grammarAccess.getIntTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // InternalMethods.g:212:1: ruleIntType : ( 'int' ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:216:2: ( ( 'int' ) )
            // InternalMethods.g:217:2: ( 'int' )
            {
            // InternalMethods.g:217:2: ( 'int' )
            // InternalMethods.g:218:3: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getIntTypeAccess().getIntKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleStringType"
    // InternalMethods.g:228:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalMethods.g:229:1: ( ruleStringType EOF )
            // InternalMethods.g:230:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalMethods.g:237:1: ruleStringType : ( 'String' ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:241:2: ( ( 'String' ) )
            // InternalMethods.g:242:2: ( 'String' )
            {
            // InternalMethods.g:242:2: ( 'String' )
            // InternalMethods.g:243:3: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleVoidType"
    // InternalMethods.g:253:1: entryRuleVoidType : ruleVoidType EOF ;
    public final void entryRuleVoidType() throws RecognitionException {
        try {
            // InternalMethods.g:254:1: ( ruleVoidType EOF )
            // InternalMethods.g:255:1: ruleVoidType EOF
            {
             before(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleVoidType();

            state._fsp--;

             after(grammarAccess.getVoidTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVoidType"


    // $ANTLR start "ruleVoidType"
    // InternalMethods.g:262:1: ruleVoidType : ( 'void' ) ;
    public final void ruleVoidType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:266:2: ( ( 'void' ) )
            // InternalMethods.g:267:2: ( 'void' )
            {
            // InternalMethods.g:267:2: ( 'void' )
            // InternalMethods.g:268:3: 'void'
            {
             before(grammarAccess.getVoidTypeAccess().getVoidKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVoidTypeAccess().getVoidKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoidType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalMethods.g:278:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalMethods.g:279:1: ( ruleBooleanType EOF )
            // InternalMethods.g:280:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalMethods.g:287:1: ruleBooleanType : ( 'boolean' ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:291:2: ( ( 'boolean' ) )
            // InternalMethods.g:292:2: ( 'boolean' )
            {
            // InternalMethods.g:292:2: ( 'boolean' )
            // InternalMethods.g:293:3: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getBooleanKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMethods.g:302:1: rule__Type__Alternatives : ( ( ruleIntType ) | ( ruleStringType ) | ( ruleVoidType ) | ( ruleBooleanType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:306:1: ( ( ruleIntType ) | ( ruleStringType ) | ( ruleVoidType ) | ( ruleBooleanType ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMethods.g:307:2: ( ruleIntType )
                    {
                    // InternalMethods.g:307:2: ( ruleIntType )
                    // InternalMethods.g:308:3: ruleIntType
                    {
                     before(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMethods.g:313:2: ( ruleStringType )
                    {
                    // InternalMethods.g:313:2: ( ruleStringType )
                    // InternalMethods.g:314:3: ruleStringType
                    {
                     before(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMethods.g:319:2: ( ruleVoidType )
                    {
                    // InternalMethods.g:319:2: ( ruleVoidType )
                    // InternalMethods.g:320:3: ruleVoidType
                    {
                     before(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVoidType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMethods.g:325:2: ( ruleBooleanType )
                    {
                    // InternalMethods.g:325:2: ( ruleBooleanType )
                    // InternalMethods.g:326:3: ruleBooleanType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMethods.g:335:1: rule__Value__Alternatives : ( ( ( rule__Value__ValueIntAssignment_0 ) ) | ( ( rule__Value__ValueOthersAssignment_1 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:339:1: ( ( ( rule__Value__ValueIntAssignment_0 ) ) | ( ( rule__Value__ValueOthersAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMethods.g:340:2: ( ( rule__Value__ValueIntAssignment_0 ) )
                    {
                    // InternalMethods.g:340:2: ( ( rule__Value__ValueIntAssignment_0 ) )
                    // InternalMethods.g:341:3: ( rule__Value__ValueIntAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getValueIntAssignment_0()); 
                    // InternalMethods.g:342:3: ( rule__Value__ValueIntAssignment_0 )
                    // InternalMethods.g:342:4: rule__Value__ValueIntAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__ValueIntAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueIntAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMethods.g:346:2: ( ( rule__Value__ValueOthersAssignment_1 ) )
                    {
                    // InternalMethods.g:346:2: ( ( rule__Value__ValueOthersAssignment_1 ) )
                    // InternalMethods.g:347:3: ( rule__Value__ValueOthersAssignment_1 )
                    {
                     before(grammarAccess.getValueAccess().getValueOthersAssignment_1()); 
                    // InternalMethods.g:348:3: ( rule__Value__ValueOthersAssignment_1 )
                    // InternalMethods.g:348:4: rule__Value__ValueOthersAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__ValueOthersAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueOthersAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Method__Group__0"
    // InternalMethods.g:356:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:360:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalMethods.g:361:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalMethods.g:368:1: rule__Method__Group__0__Impl : ( 'public' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:372:1: ( ( 'public' ) )
            // InternalMethods.g:373:1: ( 'public' )
            {
            // InternalMethods.g:373:1: ( 'public' )
            // InternalMethods.g:374:2: 'public'
            {
             before(grammarAccess.getMethodAccess().getPublicKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getPublicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalMethods.g:383:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:387:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalMethods.g:388:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalMethods.g:395:1: rule__Method__Group__1__Impl : ( ( rule__Method__TypeAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:399:1: ( ( ( rule__Method__TypeAssignment_1 ) ) )
            // InternalMethods.g:400:1: ( ( rule__Method__TypeAssignment_1 ) )
            {
            // InternalMethods.g:400:1: ( ( rule__Method__TypeAssignment_1 ) )
            // InternalMethods.g:401:2: ( rule__Method__TypeAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_1()); 
            // InternalMethods.g:402:2: ( rule__Method__TypeAssignment_1 )
            // InternalMethods.g:402:3: rule__Method__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalMethods.g:410:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:414:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalMethods.g:415:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalMethods.g:422:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:426:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // InternalMethods.g:427:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // InternalMethods.g:427:1: ( ( rule__Method__NameAssignment_2 ) )
            // InternalMethods.g:428:2: ( rule__Method__NameAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            // InternalMethods.g:429:2: ( rule__Method__NameAssignment_2 )
            // InternalMethods.g:429:3: rule__Method__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalMethods.g:437:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:441:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalMethods.g:442:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalMethods.g:449:1: rule__Method__Group__3__Impl : ( '(' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:453:1: ( ( '(' ) )
            // InternalMethods.g:454:1: ( '(' )
            {
            // InternalMethods.g:454:1: ( '(' )
            // InternalMethods.g:455:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalMethods.g:464:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:468:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalMethods.g:469:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalMethods.g:476:1: rule__Method__Group__4__Impl : ( ( rule__Method__ParameterAssignment_4 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:480:1: ( ( ( rule__Method__ParameterAssignment_4 )? ) )
            // InternalMethods.g:481:1: ( ( rule__Method__ParameterAssignment_4 )? )
            {
            // InternalMethods.g:481:1: ( ( rule__Method__ParameterAssignment_4 )? )
            // InternalMethods.g:482:2: ( rule__Method__ParameterAssignment_4 )?
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4()); 
            // InternalMethods.g:483:2: ( rule__Method__ParameterAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=14)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMethods.g:483:3: rule__Method__ParameterAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__ParameterAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getParameterAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalMethods.g:491:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:495:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalMethods.g:496:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalMethods.g:503:1: rule__Method__Group__5__Impl : ( ')' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:507:1: ( ( ')' ) )
            // InternalMethods.g:508:1: ( ')' )
            {
            // InternalMethods.g:508:1: ( ')' )
            // InternalMethods.g:509:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalMethods.g:518:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:522:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalMethods.g:523:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalMethods.g:530:1: rule__Method__Group__6__Impl : ( '{' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:534:1: ( ( '{' ) )
            // InternalMethods.g:535:1: ( '{' )
            {
            // InternalMethods.g:535:1: ( '{' )
            // InternalMethods.g:536:2: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // InternalMethods.g:545:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:549:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalMethods.g:550:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // InternalMethods.g:557:1: rule__Method__Group__7__Impl : ( ( rule__Method__AttributesAssignment_7 )* ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:561:1: ( ( ( rule__Method__AttributesAssignment_7 )* ) )
            // InternalMethods.g:562:1: ( ( rule__Method__AttributesAssignment_7 )* )
            {
            // InternalMethods.g:562:1: ( ( rule__Method__AttributesAssignment_7 )* )
            // InternalMethods.g:563:2: ( rule__Method__AttributesAssignment_7 )*
            {
             before(grammarAccess.getMethodAccess().getAttributesAssignment_7()); 
            // InternalMethods.g:564:2: ( rule__Method__AttributesAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMethods.g:564:3: rule__Method__AttributesAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Method__AttributesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getAttributesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__8"
    // InternalMethods.g:572:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:576:1: ( rule__Method__Group__8__Impl )
            // InternalMethods.g:577:2: rule__Method__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8"


    // $ANTLR start "rule__Method__Group__8__Impl"
    // InternalMethods.g:583:1: rule__Method__Group__8__Impl : ( '}' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:587:1: ( ( '}' ) )
            // InternalMethods.g:588:1: ( '}' )
            {
            // InternalMethods.g:588:1: ( '}' )
            // InternalMethods.g:589:2: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMethods.g:599:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:603:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMethods.g:604:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMethods.g:611:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__ParameterTypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:615:1: ( ( ( rule__Parameter__ParameterTypeAssignment_0 ) ) )
            // InternalMethods.g:616:1: ( ( rule__Parameter__ParameterTypeAssignment_0 ) )
            {
            // InternalMethods.g:616:1: ( ( rule__Parameter__ParameterTypeAssignment_0 ) )
            // InternalMethods.g:617:2: ( rule__Parameter__ParameterTypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAssignment_0()); 
            // InternalMethods.g:618:2: ( rule__Parameter__ParameterTypeAssignment_0 )
            // InternalMethods.g:618:3: rule__Parameter__ParameterTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParameterTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParameterTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMethods.g:626:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:630:1: ( rule__Parameter__Group__1__Impl )
            // InternalMethods.g:631:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMethods.g:637:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParameterNameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:641:1: ( ( ( rule__Parameter__ParameterNameAssignment_1 ) ) )
            // InternalMethods.g:642:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            {
            // InternalMethods.g:642:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            // InternalMethods.g:643:2: ( rule__Parameter__ParameterNameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getParameterNameAssignment_1()); 
            // InternalMethods.g:644:2: ( rule__Parameter__ParameterNameAssignment_1 )
            // InternalMethods.g:644:3: rule__Parameter__ParameterNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParameterNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParameterNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMethods.g:653:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:657:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMethods.g:658:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMethods.g:665:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AttrTypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:669:1: ( ( ( rule__Attribute__AttrTypeAssignment_0 ) ) )
            // InternalMethods.g:670:1: ( ( rule__Attribute__AttrTypeAssignment_0 ) )
            {
            // InternalMethods.g:670:1: ( ( rule__Attribute__AttrTypeAssignment_0 ) )
            // InternalMethods.g:671:2: ( rule__Attribute__AttrTypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAttrTypeAssignment_0()); 
            // InternalMethods.g:672:2: ( rule__Attribute__AttrTypeAssignment_0 )
            // InternalMethods.g:672:3: rule__Attribute__AttrTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttrTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttrTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMethods.g:680:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:684:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMethods.g:685:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMethods.g:692:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__AttributeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:696:1: ( ( ( rule__Attribute__AttributeAssignment_1 ) ) )
            // InternalMethods.g:697:1: ( ( rule__Attribute__AttributeAssignment_1 ) )
            {
            // InternalMethods.g:697:1: ( ( rule__Attribute__AttributeAssignment_1 ) )
            // InternalMethods.g:698:2: ( rule__Attribute__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeAssignment_1()); 
            // InternalMethods.g:699:2: ( rule__Attribute__AttributeAssignment_1 )
            // InternalMethods.g:699:3: rule__Attribute__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMethods.g:707:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:711:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMethods.g:712:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMethods.g:719:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:723:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalMethods.g:724:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalMethods.g:724:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalMethods.g:725:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalMethods.g:726:2: ( rule__Attribute__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMethods.g:726:3: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMethods.g:734:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:738:1: ( rule__Attribute__Group__3__Impl )
            // InternalMethods.g:739:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMethods.g:745:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:749:1: ( ( ';' ) )
            // InternalMethods.g:750:1: ( ';' )
            {
            // InternalMethods.g:750:1: ( ';' )
            // InternalMethods.g:751:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group_2__0"
    // InternalMethods.g:761:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:765:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalMethods.g:766:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // InternalMethods.g:773:1: rule__Attribute__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:777:1: ( ( '=' ) )
            // InternalMethods.g:778:1: ( '=' )
            {
            // InternalMethods.g:778:1: ( '=' )
            // InternalMethods.g:779:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // InternalMethods.g:788:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:792:1: ( rule__Attribute__Group_2__1__Impl )
            // InternalMethods.g:793:2: rule__Attribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // InternalMethods.g:799:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__ValueAssignment_2_1 ) ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:803:1: ( ( ( rule__Attribute__ValueAssignment_2_1 ) ) )
            // InternalMethods.g:804:1: ( ( rule__Attribute__ValueAssignment_2_1 ) )
            {
            // InternalMethods.g:804:1: ( ( rule__Attribute__ValueAssignment_2_1 ) )
            // InternalMethods.g:805:2: ( rule__Attribute__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2_1()); 
            // InternalMethods.g:806:2: ( rule__Attribute__ValueAssignment_2_1 )
            // InternalMethods.g:806:3: rule__Attribute__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__Model__MehtodsAssignment"
    // InternalMethods.g:815:1: rule__Model__MehtodsAssignment : ( ruleMethod ) ;
    public final void rule__Model__MehtodsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:819:1: ( ( ruleMethod ) )
            // InternalMethods.g:820:2: ( ruleMethod )
            {
            // InternalMethods.g:820:2: ( ruleMethod )
            // InternalMethods.g:821:3: ruleMethod
            {
             before(grammarAccess.getModelAccess().getMehtodsMethodParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMehtodsMethodParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MehtodsAssignment"


    // $ANTLR start "rule__Method__TypeAssignment_1"
    // InternalMethods.g:830:1: rule__Method__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Method__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:834:1: ( ( ruleType ) )
            // InternalMethods.g:835:2: ( ruleType )
            {
            // InternalMethods.g:835:2: ( ruleType )
            // InternalMethods.g:836:3: ruleType
            {
             before(grammarAccess.getMethodAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeAssignment_1"


    // $ANTLR start "rule__Method__NameAssignment_2"
    // InternalMethods.g:845:1: rule__Method__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:849:1: ( ( RULE_ID ) )
            // InternalMethods.g:850:2: ( RULE_ID )
            {
            // InternalMethods.g:850:2: ( RULE_ID )
            // InternalMethods.g:851:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_2"


    // $ANTLR start "rule__Method__ParameterAssignment_4"
    // InternalMethods.g:860:1: rule__Method__ParameterAssignment_4 : ( ruleParameter ) ;
    public final void rule__Method__ParameterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:864:1: ( ( ruleParameter ) )
            // InternalMethods.g:865:2: ( ruleParameter )
            {
            // InternalMethods.g:865:2: ( ruleParameter )
            // InternalMethods.g:866:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParameterAssignment_4"


    // $ANTLR start "rule__Method__AttributesAssignment_7"
    // InternalMethods.g:875:1: rule__Method__AttributesAssignment_7 : ( ruleAttribute ) ;
    public final void rule__Method__AttributesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:879:1: ( ( ruleAttribute ) )
            // InternalMethods.g:880:2: ( ruleAttribute )
            {
            // InternalMethods.g:880:2: ( ruleAttribute )
            // InternalMethods.g:881:3: ruleAttribute
            {
             before(grammarAccess.getMethodAccess().getAttributesAttributeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getAttributesAttributeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__AttributesAssignment_7"


    // $ANTLR start "rule__Parameter__ParameterTypeAssignment_0"
    // InternalMethods.g:890:1: rule__Parameter__ParameterTypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__ParameterTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:894:1: ( ( ruleType ) )
            // InternalMethods.g:895:2: ( ruleType )
            {
            // InternalMethods.g:895:2: ( ruleType )
            // InternalMethods.g:896:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getParameterTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getParameterTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParameterTypeAssignment_0"


    // $ANTLR start "rule__Parameter__ParameterNameAssignment_1"
    // InternalMethods.g:905:1: rule__Parameter__ParameterNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__ParameterNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:909:1: ( ( RULE_ID ) )
            // InternalMethods.g:910:2: ( RULE_ID )
            {
            // InternalMethods.g:910:2: ( RULE_ID )
            // InternalMethods.g:911:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParameterNameAssignment_1"


    // $ANTLR start "rule__Attribute__AttrTypeAssignment_0"
    // InternalMethods.g:920:1: rule__Attribute__AttrTypeAssignment_0 : ( ruleType ) ;
    public final void rule__Attribute__AttrTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:924:1: ( ( ruleType ) )
            // InternalMethods.g:925:2: ( ruleType )
            {
            // InternalMethods.g:925:2: ( ruleType )
            // InternalMethods.g:926:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getAttrTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttrTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttrTypeAssignment_0"


    // $ANTLR start "rule__Attribute__AttributeAssignment_1"
    // InternalMethods.g:935:1: rule__Attribute__AttributeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:939:1: ( ( RULE_ID ) )
            // InternalMethods.g:940:2: ( RULE_ID )
            {
            // InternalMethods.g:940:2: ( RULE_ID )
            // InternalMethods.g:941:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getAttributeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeAssignment_1"


    // $ANTLR start "rule__Attribute__ValueAssignment_2_1"
    // InternalMethods.g:950:1: rule__Attribute__ValueAssignment_2_1 : ( ruleValue ) ;
    public final void rule__Attribute__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:954:1: ( ( ruleValue ) )
            // InternalMethods.g:955:2: ( ruleValue )
            {
            // InternalMethods.g:955:2: ( ruleValue )
            // InternalMethods.g:956:3: ruleValue
            {
             before(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2_1"


    // $ANTLR start "rule__Value__ValueIntAssignment_0"
    // InternalMethods.g:965:1: rule__Value__ValueIntAssignment_0 : ( RULE_INT ) ;
    public final void rule__Value__ValueIntAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:969:1: ( ( RULE_INT ) )
            // InternalMethods.g:970:2: ( RULE_INT )
            {
            // InternalMethods.g:970:2: ( RULE_INT )
            // InternalMethods.g:971:3: RULE_INT
            {
             before(grammarAccess.getValueAccess().getValueIntINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueIntINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueIntAssignment_0"


    // $ANTLR start "rule__Value__ValueOthersAssignment_1"
    // InternalMethods.g:980:1: rule__Value__ValueOthersAssignment_1 : ( RULE_ID ) ;
    public final void rule__Value__ValueOthersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMethods.g:984:1: ( ( RULE_ID ) )
            // InternalMethods.g:985:2: ( RULE_ID )
            {
            // InternalMethods.g:985:2: ( RULE_ID )
            // InternalMethods.g:986:3: RULE_ID
            {
             before(grammarAccess.getValueAccess().getValueOthersIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueOthersIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueOthersAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000027800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000087800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});

}
package org.example.methods.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.methods.services.MethodsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMethodsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'('", "')'", "'{'", "'}'", "'='", "';'", "'int'", "'String'", "'void'", "'boolean'"
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

        public InternalMethodsParser(TokenStream input, MethodsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MethodsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMethods.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMethods.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMethods.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMethods.g:71:1: ruleModel returns [EObject current=null] : ( (lv_mehtods_0_0= ruleMethod ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mehtods_0_0 = null;



        	enterRule();

        try {
            // InternalMethods.g:77:2: ( ( (lv_mehtods_0_0= ruleMethod ) )* )
            // InternalMethods.g:78:2: ( (lv_mehtods_0_0= ruleMethod ) )*
            {
            // InternalMethods.g:78:2: ( (lv_mehtods_0_0= ruleMethod ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMethods.g:79:3: (lv_mehtods_0_0= ruleMethod )
            	    {
            	    // InternalMethods.g:79:3: (lv_mehtods_0_0= ruleMethod )
            	    // InternalMethods.g:80:4: lv_mehtods_0_0= ruleMethod
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getMehtodsMethodParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_mehtods_0_0=ruleMethod();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"mehtods",
            	    					lv_mehtods_0_0,
            	    					"org.example.methods.Methods.Method");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMethod"
    // InternalMethods.g:100:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalMethods.g:100:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalMethods.g:101:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMethods.g:107:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'public' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter ) )? otherlv_5= ')' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_parameter_4_0 = null;

        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalMethods.g:113:2: ( (otherlv_0= 'public' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter ) )? otherlv_5= ')' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}' ) )
            // InternalMethods.g:114:2: (otherlv_0= 'public' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter ) )? otherlv_5= ')' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}' )
            {
            // InternalMethods.g:114:2: (otherlv_0= 'public' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter ) )? otherlv_5= ')' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}' )
            // InternalMethods.g:115:3: otherlv_0= 'public' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameter_4_0= ruleParameter ) )? otherlv_5= ')' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getPublicKeyword_0());
            		
            // InternalMethods.g:119:3: ( (lv_type_1_0= ruleType ) )
            // InternalMethods.g:120:4: (lv_type_1_0= ruleType )
            {
            // InternalMethods.g:120:4: (lv_type_1_0= ruleType )
            // InternalMethods.g:121:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.example.methods.Methods.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMethods.g:138:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMethods.g:139:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMethods.g:139:4: (lv_name_2_0= RULE_ID )
            // InternalMethods.g:140:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMethods.g:160:3: ( (lv_parameter_4_0= ruleParameter ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=21)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMethods.g:161:4: (lv_parameter_4_0= ruleParameter )
                    {
                    // InternalMethods.g:161:4: (lv_parameter_4_0= ruleParameter )
                    // InternalMethods.g:162:5: lv_parameter_4_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getParameterParameterParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_parameter_4_0=ruleParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					set(
                    						current,
                    						"parameter",
                    						lv_parameter_4_0,
                    						"org.example.methods.Methods.Parameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMethods.g:187:3: ( (lv_attributes_7_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMethods.g:188:4: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // InternalMethods.g:188:4: (lv_attributes_7_0= ruleAttribute )
            	    // InternalMethods.g:189:5: lv_attributes_7_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMethodAccess().getAttributesAttributeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_attributes_7_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_7_0,
            	    						"org.example.methods.Methods.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalMethods.g:214:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMethods.g:214:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMethods.g:215:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMethods.g:221:1: ruleParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_parameterName_1_0=null;
        AntlrDatatypeRuleToken lv_parameterType_0_0 = null;



        	enterRule();

        try {
            // InternalMethods.g:227:2: ( ( ( (lv_parameterType_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ) )
            // InternalMethods.g:228:2: ( ( (lv_parameterType_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) )
            {
            // InternalMethods.g:228:2: ( ( (lv_parameterType_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) )
            // InternalMethods.g:229:3: ( (lv_parameterType_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) )
            {
            // InternalMethods.g:229:3: ( (lv_parameterType_0_0= ruleType ) )
            // InternalMethods.g:230:4: (lv_parameterType_0_0= ruleType )
            {
            // InternalMethods.g:230:4: (lv_parameterType_0_0= ruleType )
            // InternalMethods.g:231:5: lv_parameterType_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParameterTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_parameterType_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"parameterType",
            						lv_parameterType_0_0,
            						"org.example.methods.Methods.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMethods.g:248:3: ( (lv_parameterName_1_0= RULE_ID ) )
            // InternalMethods.g:249:4: (lv_parameterName_1_0= RULE_ID )
            {
            // InternalMethods.g:249:4: (lv_parameterName_1_0= RULE_ID )
            // InternalMethods.g:250:5: lv_parameterName_1_0= RULE_ID
            {
            lv_parameterName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_parameterName_1_0, grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameterName",
            						lv_parameterName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAttribute"
    // InternalMethods.g:270:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMethods.g:270:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMethods.g:271:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMethods.g:277:1: ruleAttribute returns [EObject current=null] : ( ( (lv_attrType_0_0= ruleType ) ) ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_attrType_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMethods.g:283:2: ( ( ( (lv_attrType_0_0= ruleType ) ) ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )? otherlv_4= ';' ) )
            // InternalMethods.g:284:2: ( ( (lv_attrType_0_0= ruleType ) ) ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )? otherlv_4= ';' )
            {
            // InternalMethods.g:284:2: ( ( (lv_attrType_0_0= ruleType ) ) ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )? otherlv_4= ';' )
            // InternalMethods.g:285:3: ( (lv_attrType_0_0= ruleType ) ) ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )? otherlv_4= ';'
            {
            // InternalMethods.g:285:3: ( (lv_attrType_0_0= ruleType ) )
            // InternalMethods.g:286:4: (lv_attrType_0_0= ruleType )
            {
            // InternalMethods.g:286:4: (lv_attrType_0_0= ruleType )
            // InternalMethods.g:287:5: lv_attrType_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getAttrTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_attrType_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"attrType",
            						lv_attrType_0_0,
            						"org.example.methods.Methods.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMethods.g:304:3: ( (lv_attribute_1_0= RULE_ID ) )
            // InternalMethods.g:305:4: (lv_attribute_1_0= RULE_ID )
            {
            // InternalMethods.g:305:4: (lv_attribute_1_0= RULE_ID )
            // InternalMethods.g:306:5: lv_attribute_1_0= RULE_ID
            {
            lv_attribute_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_attribute_1_0, grammarAccess.getAttributeAccess().getAttributeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMethods.g:322:3: (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMethods.g:323:4: otherlv_2= '=' ( (lv_value_3_0= ruleValue ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMethods.g:327:4: ( (lv_value_3_0= ruleValue ) )
                    // InternalMethods.g:328:5: (lv_value_3_0= ruleValue )
                    {
                    // InternalMethods.g:328:5: (lv_value_3_0= ruleValue )
                    // InternalMethods.g:329:6: lv_value_3_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_value_3_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.example.methods.Methods.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalMethods.g:355:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMethods.g:355:44: (iv_ruleType= ruleType EOF )
            // InternalMethods.g:356:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMethods.g:362:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntType_0= ruleIntType | this_StringType_1= ruleStringType | this_VoidType_2= ruleVoidType | this_BooleanType_3= ruleBooleanType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntType_0 = null;

        AntlrDatatypeRuleToken this_StringType_1 = null;

        AntlrDatatypeRuleToken this_VoidType_2 = null;

        AntlrDatatypeRuleToken this_BooleanType_3 = null;



        	enterRule();

        try {
            // InternalMethods.g:368:2: ( (this_IntType_0= ruleIntType | this_StringType_1= ruleStringType | this_VoidType_2= ruleVoidType | this_BooleanType_3= ruleBooleanType ) )
            // InternalMethods.g:369:2: (this_IntType_0= ruleIntType | this_StringType_1= ruleStringType | this_VoidType_2= ruleVoidType | this_BooleanType_3= ruleBooleanType )
            {
            // InternalMethods.g:369:2: (this_IntType_0= ruleIntType | this_StringType_1= ruleStringType | this_VoidType_2= ruleVoidType | this_BooleanType_3= ruleBooleanType )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMethods.g:370:3: this_IntType_0= ruleIntType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntType_0=ruleIntType();

                    state._fsp--;


                    			current.merge(this_IntType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMethods.g:381:3: this_StringType_1= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_1=ruleStringType();

                    state._fsp--;


                    			current.merge(this_StringType_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMethods.g:392:3: this_VoidType_2= ruleVoidType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VoidType_2=ruleVoidType();

                    state._fsp--;


                    			current.merge(this_VoidType_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMethods.g:403:3: this_BooleanType_3= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_3=ruleBooleanType();

                    state._fsp--;


                    			current.merge(this_BooleanType_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleValue"
    // InternalMethods.g:417:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMethods.g:417:46: (iv_ruleValue= ruleValue EOF )
            // InternalMethods.g:418:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMethods.g:424:1: ruleValue returns [EObject current=null] : ( ( (lv_valueInt_0_0= RULE_INT ) ) | ( (lv_valueOthers_1_0= RULE_ID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueInt_0_0=null;
        Token lv_valueOthers_1_0=null;


        	enterRule();

        try {
            // InternalMethods.g:430:2: ( ( ( (lv_valueInt_0_0= RULE_INT ) ) | ( (lv_valueOthers_1_0= RULE_ID ) ) ) )
            // InternalMethods.g:431:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) | ( (lv_valueOthers_1_0= RULE_ID ) ) )
            {
            // InternalMethods.g:431:2: ( ( (lv_valueInt_0_0= RULE_INT ) ) | ( (lv_valueOthers_1_0= RULE_ID ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMethods.g:432:3: ( (lv_valueInt_0_0= RULE_INT ) )
                    {
                    // InternalMethods.g:432:3: ( (lv_valueInt_0_0= RULE_INT ) )
                    // InternalMethods.g:433:4: (lv_valueInt_0_0= RULE_INT )
                    {
                    // InternalMethods.g:433:4: (lv_valueInt_0_0= RULE_INT )
                    // InternalMethods.g:434:5: lv_valueInt_0_0= RULE_INT
                    {
                    lv_valueInt_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_valueInt_0_0, grammarAccess.getValueAccess().getValueIntINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valueInt",
                    						lv_valueInt_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMethods.g:451:3: ( (lv_valueOthers_1_0= RULE_ID ) )
                    {
                    // InternalMethods.g:451:3: ( (lv_valueOthers_1_0= RULE_ID ) )
                    // InternalMethods.g:452:4: (lv_valueOthers_1_0= RULE_ID )
                    {
                    // InternalMethods.g:452:4: (lv_valueOthers_1_0= RULE_ID )
                    // InternalMethods.g:453:5: lv_valueOthers_1_0= RULE_ID
                    {
                    lv_valueOthers_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_valueOthers_1_0, grammarAccess.getValueAccess().getValueOthersIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valueOthers",
                    						lv_valueOthers_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntType"
    // InternalMethods.g:473:1: entryRuleIntType returns [String current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final String entryRuleIntType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntType = null;


        try {
            // InternalMethods.g:473:47: (iv_ruleIntType= ruleIntType EOF )
            // InternalMethods.g:474:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // InternalMethods.g:480:1: ruleIntType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'int' ;
    public final AntlrDatatypeRuleToken ruleIntType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMethods.g:486:2: (kw= 'int' )
            // InternalMethods.g:487:2: kw= 'int'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getIntTypeAccess().getIntKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleStringType"
    // InternalMethods.g:495:1: entryRuleStringType returns [String current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final String entryRuleStringType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringType = null;


        try {
            // InternalMethods.g:495:50: (iv_ruleStringType= ruleStringType EOF )
            // InternalMethods.g:496:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalMethods.g:502:1: ruleStringType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleStringType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMethods.g:508:2: (kw= 'String' )
            // InternalMethods.g:509:2: kw= 'String'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getStringTypeAccess().getStringKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleVoidType"
    // InternalMethods.g:517:1: entryRuleVoidType returns [String current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final String entryRuleVoidType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVoidType = null;


        try {
            // InternalMethods.g:517:48: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalMethods.g:518:2: iv_ruleVoidType= ruleVoidType EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;

             current =iv_ruleVoidType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoidType"


    // $ANTLR start "ruleVoidType"
    // InternalMethods.g:524:1: ruleVoidType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'void' ;
    public final AntlrDatatypeRuleToken ruleVoidType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMethods.g:530:2: (kw= 'void' )
            // InternalMethods.g:531:2: kw= 'void'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVoidTypeAccess().getVoidKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoidType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalMethods.g:539:1: entryRuleBooleanType returns [String current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final String entryRuleBooleanType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanType = null;


        try {
            // InternalMethods.g:539:51: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalMethods.g:540:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalMethods.g:546:1: ruleBooleanType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'boolean' ;
    public final AntlrDatatypeRuleToken ruleBooleanType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMethods.g:552:2: (kw= 'boolean' )
            // InternalMethods.g:553:2: kw= 'boolean'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBooleanTypeAccess().getBooleanKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003C2000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});

}
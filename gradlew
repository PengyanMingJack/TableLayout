����   3 S
  >	  ?	  @
  A
  B	  C D
  E
  F
  G
  H
 I J
  K
  L M N mViewOffsetHelper ;Lcom/kyleduo/alipayhome/widgets/support/ATViewOffsetHelper; mTempTopBottomOffset I mTempLeftRightOffset <init> ()V Code LineNumberTable LocalVariableTable this =Lcom/kyleduo/alipayhome/widgets/support/ATViewOffsetBehavior; LocalVariableTypeTable BLcom/kyleduo/alipayhome/widgets/support/ATViewOffsetBehavior<TV;>; 7(Landroid/content/Context;Landroid/util/AttributeSet;)V context Landroid/content/Context; attrs Landroid/util/AttributeSet; onLayoutChild H(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)Z parent 1Landroid/support/design/widget/CoordinatorLayout; child Landroid/view/View; layoutDirection TV; StackMapTable 	Signature 8(Landroid/support/design/widget/CoordinatorLayout;TV;I)Z layoutChild H(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;I)V 8(Landroid/support/design/widget/CoordinatorLayout;TV;I)V setTopAndBottomOffset (I)Z offset setLeftAndRightOffset getTopAndBottomOffset ()I getLeftAndRightOffset Behavior InnerClasses V<V:Landroid/view/View;>Landroid/support/design/widget/CoordinatorLayout$Behavior<TV;>; 
SourceFile ATViewOffsetBehavior.java         / 0   9com/kyleduo/alipayhome/widgets/support/ATViewOffsetHelper  O P  2 3 5 3 Q $ R 6 7 8 7 ;com/kyleduo/alipayhome/widgets/support/ATViewOffsetBehavior 8android/support/design/widget/CoordinatorLayout$Behavior (Landroid/view/View;)V onViewLayout /android/support/design/widget/CoordinatorLayout (Landroid/view/View;I)V !                             W     *� *� *� �              	                                   m     *+,� *� *� �                                    !     " #               $ %     �     S*+,� *� � *� Y,� � *� � 	*� � *� *� � 
W*� *� � *� *� � W*� �       .           " ! $ ( % 4 & 9 ( @ ) L * Q -    *    S       S & '    S ( )    S *          S       S ( +  ,     -    .  / 0     o     +,� �       
    2  3    *            & '     ( )     *                  ( +  -    1  2 3     r     *� � *� � 
�*� �           6  7  9  ;                4               ,      5 3     r     *� � *� � �*� �           ?  @  B  D                4               ,      6 7     Z     *� � *� � � �           H                         ,    @  8 7     Z     *� � *� � � �           L                         ,    @  -    ; <    = :   
   I 9	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
// BEGIN
        // int result = 0;
        mv.visitInsn(Opcodes.ICONST_0);
        mv.visitVarInsn(Opcodes.ISTORE, 1);

        // int i = 0;
        mv.visitInsn(Opcodes.ICONST_0);
        mv.visitVarInsn(Opcodes.ISTORE, 2);

        // i <= a;
        mv.visitLabel(forLabel);
        mv.visitVarInsn(Opcodes.ILOAD, 2);
        mv.visitVarInsn(Opcodes.ILOAD, 0);
        mv.visitJumpInsn(Opcodes.IF_ICMPGE, label);


        mv.visitVarInsn(Opcodes.ILOAD, 1); //result
        mv.visitVarInsn(Opcodes.ILOAD, 2);//i
        mv.visitInsn(Opcodes.ICONST_1);//1
        // (i + 1)
        mv.visitInsn(Opcodes.IADD);
        // result + (i + 1)
        mv.visitInsn(Opcodes.IADD);
        // result = result + (i + 1);
        mv.visitVarInsn(Opcodes.ISTORE, 1);

        // i++;
        mv.visitIincInsn(2, 1);
        mv.visitJumpInsn(Opcodes.GOTO, forLabel);

        mv.visitLabel(label);
        mv.visitVarInsn(Opcodes.ILOAD, 1);
        mv.visitInsn(Opcodes.IRETURN);
        mv.visitMaxs(3, 3);
        // END

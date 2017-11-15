// BEGIN (write your solution here)
        //addres 0 -> a
        //addres 1 -> result
        //addres 2 -> i

        //a in memory
        /* mv.visitInsn(Opcodes.ICONST_3);
        mv.visitIntInsn(Opcodes.ISTORE, 2);*/

        //int result = 0;
        mv.visitInsn(Opcodes.ICONST_0);
        mv.visitIntInsn(Opcodes.ISTORE, 1);

        //int i = 0;
        mv.visitInsn(Opcodes.ICONST_0);
        mv.visitIntInsn(Opcodes.ISTORE, 2);

        //начало цикла
        mv.visitLabel(forLabel);
        //i < a
        mv.visitIntInsn(Opcodes.ILOAD, 2);
        mv.visitIntInsn(Opcodes.ILOAD, 0);
        mv.visitJumpInsn(Opcodes.IF_ICMPGE, label);

        //result i 1 - in stak
        mv.visitIntInsn(Opcodes.ILOAD, 1);
        mv.visitIntInsn(Opcodes.ILOAD, 2);
        mv.visitInsn(Opcodes.ICONST_1);

        //i + 1
        mv.visitInsn(Opcodes.IADD);

        //result + (i + 1)
        mv.visitInsn(Opcodes.IADD);

        //save result
        mv.visitIntInsn(Opcodes.ISTORE, 1);

        //i++
        mv.visitIincInsn(2, 1);
        //mv.visitIntInsn(Opcodes.ILOAD,2);
        //mv.visitIntInsn(Opcodes.IINC, 1);
        //mv.visitIntInsn(Opcodes.ISTORE, 2);

        //if
        mv.visitJumpInsn(Opcodes.GOTO, forLabel);

        //return
        mv.visitLabel(label);
        mv.visitIntInsn(Opcodes.ILOAD, 1);
        mv.visitInsn(Opcodes.IRETURN);
        mv.visitMaxs(3, 3);
        // END

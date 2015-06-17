package com.github.pedrovgs.androidgameboyemulator.core.processor.isa;

import com.github.pedrovgs.androidgameboyemulator.core.processor.GBZ80;

class LoadHIntoD extends Instruction {

  LoadHIntoD(GBZ80 z80) {
    super(z80);
  }

  @Override public void execute() {
    int registerH = z80.getRegisterH();
    z80.setRegisterD(registerH);
    setLastExecutionTime(1);
  }
}

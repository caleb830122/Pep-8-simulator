package model.instructionType;

import controller.Controller;

/**
 * This class is the interface of all instructions
 *
 */

public interface Instruction {
	/**
	 * Get the opcode.
	 *
	 * @return the opcode.
	 */
	String getOpcode();

	/**
	 * Get the operand.
	 *
	 * @return the operand.
	 */
	String getOperand();

	/**
	 * Get the register.
	 *
	 * @return the register.
	 */
	String getRegister();

	/**
	 * Get the opcode.
	 *
	 * @return the opcode.
	 */

	void execute(Controller theCon);
}

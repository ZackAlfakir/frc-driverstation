package org.anidev.frcds.pc;

import org.anidev.frcds.common.DriverStation;
import org.anidev.frcds.pc.gui.DriverStationFrame;

public class PCDriverStation extends DriverStation {
	private final DriverStationFrame frame;
	
	public PCDriverStation(DriverStationFrame frame) {
		this.frame=frame;
	}
	
	@Override
	protected void setEnabledImpl() {
//		frame.setE
	}

	@Override
	protected void setElapsedTimeImpl() {
		frame.setElapsedTime(elapsedTime);
	}
}
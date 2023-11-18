package org.firstinspires.ftc.teamcode.hardware;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class CommandBasedDriveSystem extends SubsystemBase {
    private MecanumDrive drive;
    private Motor FL, BL, FR, BR;

    public CommandBasedDriveSystem(Motor FL, Motor BL, Motor FR, Motor BR){
        this.FL = FL;
        this.BL = BL;
        this.FR = FR;
        this.BR = BR;
        drive = new MecanumDrive(FL, BL, FR, BR);
    }

    public void driveRobotCentric(double strafeSpeed, double forwardSpeed, double turnSpeed){
        drive.driveRobotCentric(strafeSpeed, forwardSpeed, turnSpeed);
    }

    public void driveFieldCentric(double strafeSpeed, double forwardSpeed, double turnSpeed, double gyroAngle){
        drive.driveFieldCentric(strafeSpeed, forwardSpeed, turnSpeed, gyroAngle);
    }

}

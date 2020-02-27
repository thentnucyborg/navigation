/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2015 Adept Technology, Inc.
Copyright (C) 2016-2018 Omron Adept Technologies, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerSimpleLogRobotDebugPackets {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArServerSimpleLogRobotDebugPackets(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArServerSimpleLogRobotDebugPackets obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerSimpleLogRobotDebugPackets(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerSimpleLogRobotDebugPackets(ArServerHandlerCommands commands, ArRobot robot, String baseDirectory) {
    this(ArNetworkingJavaJNI.new_ArServerSimpleLogRobotDebugPackets__SWIG_0(ArServerHandlerCommands.getCPtr(commands), commands, ArRobot.getCPtr(robot), robot, baseDirectory), true);
  }

  public ArServerSimpleLogRobotDebugPackets(ArServerHandlerCommands commands, ArRobot robot) {
    this(ArNetworkingJavaJNI.new_ArServerSimpleLogRobotDebugPackets__SWIG_1(ArServerHandlerCommands.getCPtr(commands), commands, ArRobot.getCPtr(robot), robot), true);
  }

  public boolean startLogging(String fileName) {
    return ArNetworkingJavaJNI.ArServerSimpleLogRobotDebugPackets_startLogging__SWIG_0(swigCPtr, this, fileName);
  }

  public boolean startLogging() {
    return ArNetworkingJavaJNI.ArServerSimpleLogRobotDebugPackets_startLogging__SWIG_1(swigCPtr, this);
  }

  public boolean stopLogging() {
    return ArNetworkingJavaJNI.ArServerSimpleLogRobotDebugPackets_stopLogging(swigCPtr, this);
  }

  public boolean packetHandler(ArRobotPacket packet) {
    return ArNetworkingJavaJNI.ArServerSimpleLogRobotDebugPackets_packetHandler(swigCPtr, this, ArRobotPacket.getCPtr(packet), packet);
  }

  public void addToInfoGroup(ArStringInfoGroup infoGroup, String name, int whichVal, String format) {
    ArNetworkingJavaJNI.ArServerSimpleLogRobotDebugPackets_addToInfoGroup__SWIG_0(swigCPtr, this, ArStringInfoGroup.getCPtr(infoGroup), infoGroup, name, whichVal, format);
  }

  public void addToInfoGroup(ArStringInfoGroup infoGroup, String name, int whichVal) {
    ArNetworkingJavaJNI.ArServerSimpleLogRobotDebugPackets_addToInfoGroup__SWIG_1(swigCPtr, this, ArStringInfoGroup.getCPtr(infoGroup), infoGroup, name, whichVal);
  }

  public int getNumValues() {
    return ArNetworkingJavaJNI.ArServerSimpleLogRobotDebugPackets_getNumValues(swigCPtr, this);
  }

  public int getValue(int whichVal) {
    return ArNetworkingJavaJNI.ArServerSimpleLogRobotDebugPackets_getValue(swigCPtr, this, whichVal);
  }

}

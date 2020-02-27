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
public class ArServerHandlerMapping {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArServerHandlerMapping(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArServerHandlerMapping obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerHandlerMapping(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerHandlerMapping(ArServerBase server, ArRobot robot, ArLaser laser, String baseDirectory, String tempDirectory, boolean useReflectorValues, ArLaser laser2, String sickSuffix, String sick2Suffix, SWIGTYPE_p_std__listT_ArLaser_p_t extraLasers) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerMapping__SWIG_0(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, baseDirectory, tempDirectory, useReflectorValues, ArLaser.getCPtr(laser2), laser2, sickSuffix, sick2Suffix, SWIGTYPE_p_std__listT_ArLaser_p_t.getCPtr(extraLasers)), true);
  }

  public ArServerHandlerMapping(ArServerBase server, ArRobot robot, ArLaser laser, String baseDirectory, String tempDirectory, boolean useReflectorValues, ArLaser laser2, String sickSuffix, String sick2Suffix) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerMapping__SWIG_1(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, baseDirectory, tempDirectory, useReflectorValues, ArLaser.getCPtr(laser2), laser2, sickSuffix, sick2Suffix), true);
  }

  public ArServerHandlerMapping(ArServerBase server, ArRobot robot, ArLaser laser, String baseDirectory, String tempDirectory, boolean useReflectorValues, ArLaser laser2, String sickSuffix) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerMapping__SWIG_2(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, baseDirectory, tempDirectory, useReflectorValues, ArLaser.getCPtr(laser2), laser2, sickSuffix), true);
  }

  public ArServerHandlerMapping(ArServerBase server, ArRobot robot, ArLaser laser, String baseDirectory, String tempDirectory, boolean useReflectorValues, ArLaser laser2) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerMapping__SWIG_3(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, baseDirectory, tempDirectory, useReflectorValues, ArLaser.getCPtr(laser2), laser2), true);
  }

  public ArServerHandlerMapping(ArServerBase server, ArRobot robot, ArLaser laser, String baseDirectory, String tempDirectory, boolean useReflectorValues) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerMapping__SWIG_4(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, baseDirectory, tempDirectory, useReflectorValues), true);
  }

  public ArServerHandlerMapping(ArServerBase server, ArRobot robot, ArLaser laser, String baseDirectory, String tempDirectory) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerMapping__SWIG_5(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, baseDirectory, tempDirectory), true);
  }

  public ArServerHandlerMapping(ArServerBase server, ArRobot robot, ArLaser laser, String baseDirectory) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerMapping__SWIG_6(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, baseDirectory), true);
  }

  public ArServerHandlerMapping(ArServerBase server, ArRobot robot, ArLaser laser) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerMapping__SWIG_7(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser), true);
  }

  public void serverMappingStart(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_serverMappingStart(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void serverMappingEnd(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_serverMappingEnd(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void serverMappingStatus(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_serverMappingStatus(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public boolean isMapping() {
    return ArNetworkingJavaJNI.ArServerHandlerMapping_isMapping(swigCPtr, this);
  }

  public void forceReading() {
    ArNetworkingJavaJNI.ArServerHandlerMapping_forceReading(swigCPtr, this);
  }

  public String getFileName() {
    return ArNetworkingJavaJNI.ArServerHandlerMapping_getFileName(swigCPtr, this);
  }

  public String getMapName() {
    return ArNetworkingJavaJNI.ArServerHandlerMapping_getMapName(swigCPtr, this);
  }

  public void addSimpleCommands(ArServerHandlerCommands handlerCommands) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addSimpleCommands(swigCPtr, this, ArServerHandlerCommands.getCPtr(handlerCommands), handlerCommands);
  }

  public void simpleLoopStart(ArArgumentBuilder arg) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_simpleLoopStart(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg);
  }

  public void simpleLoopEnd(ArArgumentBuilder arg) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_simpleLoopEnd(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg);
  }

  public void addStringForStartOfLogs(String str, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addStringForStartOfLogs__SWIG_0(swigCPtr, this, str, position.swigValue());
  }

  public void addStringForStartOfLogs(String str) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addStringForStartOfLogs__SWIG_1(swigCPtr, this, str);
  }

  public void remStringForStartOfLogs(String str) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_remStringForStartOfLogs(swigCPtr, this, str);
  }

  public void addTagToLog(String str) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addTagToLog(swigCPtr, this, str);
  }

  public void addInfoToLog(String str) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addInfoToLog(swigCPtr, this, str);
  }

  public boolean addLocationData(String name, SWIGTYPE_p_ArRetFunctor3T_int_ArTime_ArPose_p_ArPoseWithTime_p_t functor) {
    return ArNetworkingJavaJNI.ArServerHandlerMapping_addLocationData(swigCPtr, this, name, SWIGTYPE_p_ArRetFunctor3T_int_ArTime_ArPose_p_ArPoseWithTime_p_t.getCPtr(functor));
  }

  public void addMappingStartCallback(ArFunctor functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addMappingStartCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addMappingStartCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addMappingStartCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remMappingStartCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_remMappingStartCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addMappingBegunCallback(ArFunctor functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addMappingBegunCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addMappingBegunCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addMappingBegunCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remMappingBegunCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_remMappingBegunCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addMappingEndCallback(ArFunctor functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addMappingEndCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addMappingEndCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addMappingEndCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remMappingEndCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_remMappingEndCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addMappingEndedCallback(ArFunctor functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addMappingEndedCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addMappingEndedCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addMappingEndedCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remMappingEndedCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_remMappingEndedCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addPreMoveCallback(ArFunctor functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addPreMoveCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addPreMoveCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addPreMoveCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remPreMoveCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_remPreMoveCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addPostMoveCallback(ArFunctor functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addPostMoveCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addPostMoveCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addPostMoveCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remPostMoveCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_remPostMoveCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public boolean packetHandler(ArRobotPacket packet) {
    return ArNetworkingJavaJNI.ArServerHandlerMapping_packetHandler(swigCPtr, this, ArRobotPacket.getCPtr(packet), packet);
  }

  public SWIGTYPE_p_std__mapT_std__string_ArRetFunctor3T_int_ArTime_ArPose_p_ArPoseWithTime_p_t_p_ArStrCaseCmpOp_t getLocationDataMap() {
    long cPtr = ArNetworkingJavaJNI.ArServerHandlerMapping_getLocationDataMap(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__mapT_std__string_ArRetFunctor3T_int_ArTime_ArPose_p_ArPoseWithTime_p_t_p_ArStrCaseCmpOp_t(cPtr, false);
  }

  public void addStringsForStartOfLogToMap(ArMap arMap) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_addStringsForStartOfLogToMap(swigCPtr, this, ArMap.getCPtr(arMap), arMap);
  }

  public SWIGTYPE_p_ArZippable getZipFile() {
    long cPtr = ArNetworkingJavaJNI.ArServerHandlerMapping_getZipFile(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArZippable(cPtr, false);
  }

  public SWIGTYPE_p_ArZippable getSnapshotZipFile() {
    long cPtr = ArNetworkingJavaJNI.ArServerHandlerMapping_getSnapshotZipFile(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArZippable(cPtr, false);
  }

  public void setZipFile(SWIGTYPE_p_ArZippable zipFile) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_setZipFile(swigCPtr, this, SWIGTYPE_p_ArZippable.getCPtr(zipFile));
  }

  public void setSnapshotZipFile(SWIGTYPE_p_ArZippable zipFile) {
    ArNetworkingJavaJNI.ArServerHandlerMapping_setSnapshotZipFile(swigCPtr, this, SWIGTYPE_p_ArZippable.getCPtr(zipFile));
  }

}

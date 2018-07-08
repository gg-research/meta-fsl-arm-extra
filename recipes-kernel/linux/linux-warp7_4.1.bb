# Copyright (C) 2016 NXP Semiconductors
# Released under the MIT license (see COPYING.MIT for the terms)
#include recipes-kernel/linux/linux-fslc.inc
#DEPENDS += "lzop-native bc-native"
#SRCBRANCH = "4.1-1.0.x-imx"
#SRCREV = "511f37a20970db04ae3e1aff5e48ca4626e9197b"
#LOCALVERSION = "-${SRCBRANCH}-warp7"
#SRC_URI = "git://github.com/warp7/linux-fslc.git;branch=${SRCBRANCH} \
#           file://defconfig"
#COMPATIBLE_MACHINE = "(imx7s-warp)"


### 6/18 tried this
#    and it was then able to fetch correctly. no checksum issues
#
# Released under the MIT license (see COPYING.MIT for the terms)
#    
include recipes-kernel/linux/linux-imx.inc
#
include recipes-kernel/linux/linux-dtb.inc
#    
DEPENDS += "lzop-native bc-native"
#     
SRCBRANCH = "4.1-1.0.x-imx"
#
# This rev. is 3 behind the tip.  7/7/18 not 3 behind but more?
#
# The 3 changes are for DSI display - this is when comparing freescale and warp7 branches
#
# this commit seems to be on the freescale branch 
# https://github.com/Freescale/linux-fslc/commit/fa571312b4271e368ca99ffcdf7992247d534e55
## 
# SRCREV = "fa571312b4271e368ca99ffcdf7992247d534e55"
#
##  warp7    5/5/2017 tip
SRCREV = "a543d1bd884028bed97c06ae4087e051a9176499"

# github.com/freescale/linux-fslc tip 
# SRCREV = "c3518e1f0743b54bdf685fafb3d6e5d6354698f2"
#
SRC_URI = "git://github.com/WaRP7/linux-fslc.git;branch=${SRCBRANCH} \
           file://defconfig"    
# SRC_URI = "git://github.com/freescale/linux-fslc.git;branch=${SRCBRANCH} \
#            file://defconfig"    

#
COMPATIBLE_MACHINE = "(imx7s-warp)"
#   


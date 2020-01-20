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
#SRCREV = "a543d1bd884028bed97c06ae4087e051a9176499"

# gg-research tip 
# 
# Ignore the rev - we should be ok
#
## SRCREV = "21be0bccf41140118f86f796152eabb355d2f084"
#SRCREV = "4231625191d35c8d2c113333ba468d786c430a2c"
#SRCREV = "fc52da67e1f73c0c88a2e7b58d327c2bb482e863"
#SRCREV = "374ad2cc0b8178e7712d66d971286dcd6c398371"
#SRCREV = "4e5d7549a75adc84007a3e18e1c734bb0dc873f8"
#SRCREV = "20e3ed5897810510b4256ab6302019626de7f5d0"
#SRCREV = "19d7bc872371e1be08bd1505a2acf14ea5c8ca90"
#SRCREV = "9396a7ec6e3e10d6c62e93931e6ee952e4f6a113"
#SRCREV = "35d8470650501d14d318ac08b7e001d61ba7cd92"
#SRCREV = "830840ba4ef1d209de2b4bfc7e660114a3a9f2ed"
#SRCREV = "c84cded19de6cc4de90b83edc34786cc0dd8fcd6"
#SRCREV = "74eaa4d44b149210f04f09c4fc60fe3a3264c83f"
SRCREV = "c16d2dfb724b4b24a4a99f90436bc11ef3108c6d"

# github.com/freescale/linux-fslc tip 
# SRCREV = "c3518e1f0743b54bdf685fafb3d6e5d6354698f2"
#
#SRC_URI = "git://github.com/WaRP7/linux-fslc.git;branch=${SRCBRANCH} \
#           file://defconfig"    
#
# 1. some fixes for compile errors/warnings here
# 2. now uses daiane dts file
SRC_URI = "git://github.com/gg-research/linux-fslc.git;branch=${SRCBRANCH} \
           file://defconfig"    
# SRC_URI = "git://github.com/freescale/linux-fslc.git;branch=${SRCBRANCH} \
#            file://defconfig"    

#
COMPATIBLE_MACHINE = "(imx7s-warp)"
#   


package com.sayna.remotecontrol.feature_rc_action.domain.use_case

data class RCActionUseCases(
    val getRCActionsUseCase: GetRCActionsUseCase,
    val deleteRCActionUseCase: DeleteRCActionUseCase,
    val addRCActionUseCase: AddRCActionUseCase
)
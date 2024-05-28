package com.sayna.remotecontrol.feature_rc_action.presentation.add_rcaction

sealed class AddEditRCActionEvent {
    data class SaveRCAction(val title: String, val frequency: Int, val code: String): AddEditRCActionEvent()
}
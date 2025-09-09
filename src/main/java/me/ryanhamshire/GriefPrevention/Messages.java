/* GriefPrevention Server Plugin for Minecraft
Copyright (C) 2012 Ryan Hamshire

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License
as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program.
If not, see <http://www.gnu.org/licenses/>.
*/

package me.ryanhamshire.GriefPrevention;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum Messages {

    RespectingClaims(
            "Now respecting claims.",
            "Ahora respetando Claims."
    ),
    IgnoringClaims(
            "Now ignoring claims.",
            "Ahora ignorando Claims."
    ),
    NoCreativeUnClaim(
            "You can't unclaim this land. You can only make this claim larger or create additional claims.",
            "No puedes quitar el Claim de esta zona. Solo puedes agrandar este Claim o crear Claims adicionales."
    ),
    SuccessfulAbandon(
            "Claims abandoned. You now have {0} available claim blocks.",
            "Claims abandonados. Ahora tienes {0} Claimblocks disponibles.",
            "0: remaining blocks"
    ),
    TransferClaimPermission(
            "That command requires the administrative claims permission.",
            "Ese comando requiere el permiso para Claims administrativos."
    ),
    TransferClaimMissing(
            "There's no claim here. Stand in the administrative claim you want to transfer.",
            "No hay ningún Claim aquí. Ponte dentro del Claim administrativo que quieres transferir."
    ),
    TransferClaimAdminOnly(
            "Only administrative claims may be transferred to a player.",
            "Solo los Claims administrativos pueden transferirse a un jugador."
    ),
    PlayerNotFound2(
            "No player by that name has logged in recently.",
            "Ningún jugador con ese nombre se ha conectado recientemente."
    ),
    TransferTopLevel(
            "Only top level claims (not subdivisions) may be transferred. Stand outside of the subdivision and try again.",
            "Solo los Claims de nivel superior (no subdivisiones) pueden transferirse. Ponte fuera de la subdivisión e inténtalo de nuevo."
    ),
    TransferSuccess(
            "Claim transferred.",
            "Claim transferido."
    ),
    TrustListNoClaim(
            "Stand inside the claim you're curious about.",
            "Ponte dentro del Claim que te interesa."
    ),
    ClearPermsOwnerOnly(
            "Only the claim owner can clear all permissions.",
            "Solo el dueño del Claim puede limpiar todos los permisos."
    ),
    UntrustIndividualAllClaims(
            "Revoked {0}'s access to ALL your claims. To set permissions for a single claim, stand inside it.",
            "Se revocó el acceso de {0} a TODOS tus Claims. Para ajustar permisos de un Claim específico, ponte dentro de él.",
            "0: untrusted player"
    ),
    UntrustEveryoneAllClaims(
            "Cleared permissions in ALL your claims. To set permissions for a single claim, stand inside it.",
            "Se limpiaron los permisos en TODOS tus Claims. Para ajustar permisos de un Claim específico, ponte dentro de él."
    ),
    NoPermissionTrust(
            "You don't have {0}'s permission to manage permissions here.",
            "No tienes el permiso de {0} para gestionar permisos aquí.",
            "0: claim owner's name"
    ),
    ClearPermissionsOneClaim(
            "Cleared permissions in this claim. To set permission for ALL your claims, stand outside them.",
            "Se limpiaron los permisos en este Claim. Para configurar permisos para TODOS tus Claims, ponte fuera de ellos."
    ),
    UntrustIndividualSingleClaim(
            "Revoked {0}'s access to this claim. To set permissions for a ALL your claims, stand outside them.",
            "Se revocó el acceso de {0} a este Claim. Para ajustar permisos de TODOS tus Claims, ponte fuera de ellos.",
            "0: untrusted player"
    ),
    AdminClaimsMode(
            "Administrative claims mode active. Any claims created will be free and editable by other administrators.",
            "Modo de Claims administrativos activo. Cualquier Claim creado será gratis y editable por otros administradores."
    ),
    BasicClaimsMode(
            "Returned to basic claim creation mode.",
            "Has vuelto al modo básico de creación de Claims."
    ),
    SubdivisionMode(
            "Subdivision mode. Use your shovel to create subdivisions in your existing claims. Use /basicclaims to exit.",
            "Modo de subdivisión. Usa tu pala para crear subdivisiones en tus Claims existentes. Usa /basicclaims para salir."
    ),
    SubdivisionVideo2(
            "Click for Subdivision Help: {0}",
            "Haz clic para ayuda de Subdivisión: {0}",
            "0:video URL"
    ),
    DeleteClaimMissing(
            "There's no claim here.",
            "No hay ningún Claim aquí."
    ),
    DeletionSubdivisionWarning(
            "This claim includes subdivisions. If you're sure you want to delete it, use /deleteclaim again.",
            "Este Claim incluye subdivisiones. Si estás seguro de borrarlo, usa /deleteclaim otra vez."
    ),
    DeleteSuccess(
            "Claim deleted.",
            "Claim eliminado."
    ),
    CantDeleteAdminClaim(
            "You don't have permission to delete administrative claims.",
            "No tienes permiso para borrar Claims administrativos."
    ),
    DeleteAllSuccess(
            "Deleted all of {0}'s claims.",
            "Se borraron todos los Claims de {0}.",
            "0: owner's name"
    ),
    NoDeletePermission(
            "You don't have permission to delete claims.",
            "No tienes permiso para borrar Claims."
    ),
    AllAdminDeleted(
            "Deleted all administrative claims.",
            "Se borraron todos los Claims administrativos."
    ),
    AdjustBlocksSuccess(
            "Adjusted {0}'s bonus claim blocks by {1}. New total bonus blocks: {2}.",
            "Se ajustaron los Claimblocks extra de {0} en {1}. Nuevo total de bloques extra: {2}.",
            "0: player; 1: adjustment; 2: new total"
    ),
    AdjustBlocksAllSuccess(
            "Adjusted all online players' bonus claim blocks by {0}.",
            "Se ajustaron los Claimblocks extra de todos los jugadores en línea en {0}.",
            "0: adjustment amount"
    ),
    NotTrappedHere(
            "You can build here. Save yourself.",
            "Puedes construir aquí. Sálvate tú mismo."
    ),
    RescuePending(
            "If you stay put for 10 seconds, you'll be teleported out. Please wait.",
            "Si te quedas quieto 10 segundos, serás teletransportado fuera. Por favor espera."
    ),
    AbandonClaimMissing(
            "Stand in the claim you want to delete, or consider /abandonallclaims.",
            "Ponte dentro del Claim que quieres borrar, o considera /abandonallclaims."
    ),
    NotYourClaim(
            "This isn't your claim.",
            "Este no es tu Claim."
    ),
    DeleteTopLevelClaim(
            "To delete a subdivision, stand inside it. Otherwise, use /abandontoplevelclaim to delete this claim and all subdivisions.",
            "Para borrar una subdivisión, ponte dentro de ella. De lo contrario, usa /abandontoplevelclaim para borrar este Claim y todas sus subdivisiones."
    ),
    AbandonSuccess(
            "Claim abandoned. You now have {0} available claim blocks.",
            "Claim abandonado. Ahora tienes {0} Claimblocks disponibles.",
            "0: remaining claim blocks"
    ),
    ConfirmAbandonAllClaims(
            "Are you sure you want to abandon ALL of your claims? Please confirm with /abandonallclaims confirm",
            "¿Seguro que quieres abandonar TODOS tus Claims? Confirma con /abandonallclaims confirm"
    ),
    CantGrantThatPermission(
            "You can't grant a permission you don't have yourself.",
            "No puedes otorgar un permiso que tú mismo no tienes."
    ),
    GrantPermissionNoClaim(
            "Stand inside the claim where you want to grant permission.",
            "Ponte dentro del Claim donde quieres otorgar el permiso."
    ),
    GrantPermissionConfirmation(
            "Granted {0} permission to {1} {2}.",
            "Se otorgó a {0} permiso para {1} {2}.",
            "0: target player; 1: permission description; 2: scope (changed claims)"
    ),
    ManageUniversalPermissionsInstruction(
            "To manage permissions for ALL your claims, stand outside them.",
            "Para gestionar permisos de TODOS tus Claims, ponte fuera de ellos."
    ),
    ManageOneClaimPermissionsInstruction(
            "To manage permissions for a specific claim, stand inside it.",
            "Para gestionar permisos de un Claim específico, ponte dentro de él."
    ),
    CollectivePublic(
            "the public",
            "el público",
            "as in 'granted the public permission to...'"
    ),
    BuildPermission(
            "build",
            "construir"
    ),
    ContainersPermission(
            "access containers and animals",
            "acceder a contenedores y animales"
    ),
    AccessPermission(
            "use buttons and levers",
            "usar botones y palancas"
    ),
    PermissionsPermission(
            "manage permissions",
            "gestionar permisos"
    ),
    LocationCurrentClaim(
            "in this claim",
            "en este Claim"
    ),
    LocationAllClaims(
            "in all your claims",
            "en todos tus Claims"
    ),
    PvPImmunityStart(
            "You're protected from attack by other players as long as your inventory is empty.",
            "Estás protegido de ataques de otros jugadores mientras tu inventario esté vacío."
    ),
    DonateItemsInstruction(
            "To give away the item(s) in your hand, left-click the chest again.",
            "Para regalar los objetos en tu mano, haz clic izquierdo al cofre de nuevo."
    ),
    ChestFull(
            "This chest is full.",
            "Este cofre está lleno."
    ),
    DonationSuccess(
            "Item(s) transferred to chest!",
            "¡Objeto(s) transferidos al cofre!"
    ),
    PlayerTooCloseForFire2(
            "You can't start a fire this close to another player.",
            "No puedes iniciar fuego tan cerca de otro jugador."
    ),
    TooDeepToClaim(
            "This chest can't be protected because it's too deep underground. Consider moving it.",
            "Este cofre no puede protegerse porque está demasiado profundo. Considera moverlo."
    ),
    ChestClaimConfirmation(
            "This chest is protected.",
            "Este cofre está protegido."
    ),
    AutomaticClaimNotification(
            "This chest and nearby blocks are protected from breakage and theft.",
            "Este cofre y los bloques cercanos están protegidos contra roturas y robos."
    ),
    AutomaticClaimOtherClaimTooClose(
            "Cannot create a claim for your chest, there is another claim too close!",
            "¡No se puede crear un Claim para tu cofre; hay otro Claim demasiado cerca!"
    ),
    UnprotectedChestWarning(
            "This chest is NOT protected. Consider using a golden shovel to expand an existing claim or to create a new one.",
            "Este cofre NO está protegido. Considera usar una pala dorada para ampliar un Claim existente o crear uno nuevo."
    ),
    ThatPlayerPvPImmune(
            "You can't injure defenseless players.",
            "No puedes dañar a jugadores indefensos."
    ),
    CantFightWhileImmune(
            "You can't fight someone while you're protected from PvP.",
            "No puedes pelear mientras estás protegido del PvP."
    ),
    NoDamageClaimedEntity(
            "That belongs to {0}.",
            "Eso pertenece a {0}.",
            "0: owner name"
    ),
    ShovelBasicClaimMode(
            "Shovel returned to basic claims mode.",
            "La pala volvió al modo básico de Claims."
    ),
    RemainingBlocks(
            "You may claim up to {0} more blocks.",
            "Puedes hacer Claim de hasta {0} bloques más.",
            "0: remaining blocks"
    ),
    CreativeBasicsVideo2(
            "Click for Land Claim Help: {0}",
            "Haz clic para ayuda de Claim de terreno: {0}",
            "{0}: video URL"
    ),
    SurvivalBasicsVideo2(
            "Click for Land Claim Help: {0}",
            "Haz clic para ayuda de Claim de terreno: {0}",
            "{0}: video URL"
    ),
    TrappedChatKeyword(
            "trapped;stuck",
            "trapped;stuck",
            "When mentioned in chat, players get information about the /trapped command (multiple words can be separated with semi-colons)"
    ),
    TrappedInstructions(
            "Are you trapped in someone's land claim? Try the /trapped command.",
            "¿Estás atrapado en el Claim de alguien? Prueba el comando /trapped."
    ),
    PvPNoDrop(
            "You can't drop items while in PvP combat.",
            "No puedes soltar objetos durante combate PvP."
    ),
    PvPNoContainers(
            "You can't access containers during PvP combat.",
            "No puedes acceder a contenedores durante combate PvP."
    ),
    PvPImmunityEnd(
            "Now you can fight with other players.",
            "Ahora puedes pelear con otros jugadores."
    ),
    NoBedPermission(
            "{0} hasn't given you permission to sleep here.",
            "{0} no te ha dado permiso para dormir aquí.",
            "0: claim owner"
    ),
    NoWildernessBuckets(
            "You may only dump buckets inside your claim(s) or underground.",
            "Solo puedes vaciar cubos dentro de tus Claims o bajo tierra."
    ),
    NoLavaNearOtherPlayer(
            "You can't place lava this close to {0}.",
            "No puedes colocar lava tan cerca de {0}.",
            "0: nearby player"
    ),
    TooFarAway(
            "That's too far away.",
            "Eso está demasiado lejos."
    ),
    BlockNotClaimed(
            "No one has claimed this block.",
            "Nadie ha hecho Claim de este bloque."
    ),
    BlockClaimed(
            "That block has been claimed by {0}.",
            "Ese bloque tiene Claim de {0}.",
            "0: claim owner"
    ),
    NoCreateClaimPermission(
            "You don't have permission to claim land.",
            "No tienes permiso para hacer Claim de terreno."
    ),
    ResizeClaimTooNarrow(
            "This new size would be too small. Claims must be at least {0} blocks wide.",
            "Este nuevo tamaño sería demasiado pequeño. Los Claims deben tener al menos {0} bloques de ancho.",
            "0: minimum claim width"
    ),
    ResizeNeedMoreBlocks(
            "You don't have enough blocks for this size. You need {0} more.",
            "No tienes suficientes bloques para este tamaño. Necesitas {0} más.",
            "0: how many needed"
    ),
    ClaimResizeSuccess(
            "Claim resized. {0} available claim blocks remaining.",
            "Claim redimensionado. Quedan {0} Claimblocks disponibles.",
            "0: remaining blocks"
    ),
    ResizeFailOverlap(
            "Can't resize here because it would overlap another nearby claim.",
            "No puedes redimensionar aquí porque se superpondría con otro Claim cercano."
    ),
    ResizeStart(
            "Resizing claim. Use your shovel again at the new location for this corner.",
            "Redimensionando Claim. Usa tu pala otra vez en la nueva ubicación para esta esquina."
    ),
    ResizeFailOverlapSubdivision(
            "You can't create a subdivision here because it would overlap another subdivision. Consider /abandonclaim to delete it, or use your shovel at a corner to resize it.",
            "No puedes crear una subdivisión aquí porque se superpondría con otra. Considera /abandonclaim para borrarla, o usa tu pala en una esquina para redimensionarla."
    ),
    SubdivisionStart(
            "Subdivision corner set! Use your shovel at the location for the opposite corner of this new subdivision.",
            "¡Esquina de subdivisión establecida! Usa tu pala en la ubicación de la esquina opuesta de esta nueva subdivisión."
    ),
    CreateSubdivisionOverlap(
            "Your selected area overlaps another subdivision.",
            "Tu área seleccionada se superpone con otra subdivisión."
    ),
    SubdivisionSuccess(
            "Subdivision created! Use /trust to share it with friends.",
            "¡Subdivisión creada! Usa /trust para compartirla con amigos."
    ),
    CreateClaimFailOverlap(
            "You can't create a claim here because it would overlap your other claim. Use /abandonclaim to delete it, or use your shovel at a corner to resize it.",
            "No puedes crear un Claim aquí porque se superpondría con tu otro Claim. Usa /abandonclaim para borrarlo, o usa tu pala en una esquina para redimensionarlo."
    ),
    CreateClaimFailOverlapOtherPlayer(
            "You can't create a claim here because it would overlap {0}'s claim.",
            "No puedes crear un Claim aquí porque se superpondría con el Claim de {0}.",
            "0: other claim owner"
    ),
    ClaimsDisabledWorld(
            "Land claims are disabled in this world.",
            "Los Claims están deshabilitados en este mundo."
    ),
    ClaimStart(
            "Claim corner set! Use the shovel again at the opposite corner to claim a rectangle of land. To cancel, put your shovel away.",
            "¡Esquina del Claim establecida! Usa la pala de nuevo en la esquina opuesta para reclamar un rectángulo de terreno. Para cancelar, guarda tu pala."
    ),
    NewClaimTooNarrow(
            "This claim would be too small. Any claim must be at least {0} blocks wide.",
            "Este Claim sería demasiado pequeño. Cualquier Claim debe tener al menos {0} bloques de ancho.",
            "0: minimum claim width"
    ),
    ResizeClaimInsufficientArea(
            "This claim would be too small. Any claim must use at least {0} total claim blocks.",
            "Este Claim sería demasiado pequeño. Cualquier Claim debe usar al menos {0} Claimblocks totales.",
            "0: minimum claim area"
    ),
    CreateClaimInsufficientBlocks(
            "You don't have enough blocks to claim that entire area. You need {0} more blocks.",
            "No tienes suficientes bloques para hacer Claim de toda esa área. Necesitas {0} bloques más.",
            "0: additional blocks needed"
    ),
    AbandonClaimAdvertisement(
            "To delete another claim and free up some blocks, use /abandonclaim.",
            "Para borrar otro Claim y liberar algunos bloques, usa /abandonclaim."
    ),
    CreateClaimFailOverlapShort(
            "Your selected area overlaps an existing claim.",
            "Tu área seleccionada se superpone con un Claim existente."
    ),
    CreateClaimSuccess(
            "Claim created! Use /trust to share it with friends.",
            "¡Claim creado! Usa /trust para compartirlo con amigos."
    ),
    RescueAbortedMoved(
            "You moved! Rescue cancelled.",
            "¡Te moviste! Rescate cancelado."
    ),
    OnlyOwnersModifyClaims(
            "Only {0} can modify this claim.",
            "Solo {0} puede modificar este Claim.",
            "0: owner name"
    ),
    NoBuildPvP(
            "You can't build in claims during PvP combat.",
            "No puedes construir en Claims durante combate PvP."
    ),
    NoBuildPermission(
            "You don't have {0}'s permission to build here.",
            "No tienes el permiso de {0} para construir aquí.",
            "0: owner name"
    ),
    NoAccessPermission(
            "You don't have {0}'s permission to use that.",
            "No tienes el permiso de {0} para usar eso.",
            "0: owner name. access permission controls buttons, levers, and beds"
    ),
    NoContainersPermission(
            "You don't have {0}'s permission to use that.",
            "No tienes el permiso de {0} para usar eso.",
            "0: owner's name. containers also include crafting blocks"
    ),
    OwnerNameForAdminClaims(
            "an administrator",
            "un administrador",
            "as in 'You don't have an administrator's permission to build here.'"
    ),
    UnknownPlayerName(
            "someone",
            "alguien",
            "Name used for unknown players. UUID will be appended if available: \"someone (01234567-0123-0123-0123-0123456789ab)\""
    ),
    ClaimTooSmallForEntities(
            "This claim isn't big enough for that. Try enlarging it.",
            "Este Claim no es lo suficientemente grande para eso. Intenta agrandarlo."
    ),
    TooManyEntitiesInClaim(
            "This claim has too many entities already. Try enlarging the claim or removing some animals, monsters, paintings, or minecarts.",
            "Este Claim ya tiene demasiadas entidades. Intenta agrandar el Claim o eliminar algunos animales, monstruos, cuadros o vagonetas."
    ),
    YouHaveNoClaims(
            "You don't have any land claims.",
            "No tienes ningún Claim."
    ),
    AutoBanNotify(
            "Auto-banned {0}({1}). See logs for details.",
            "Auto-baneado {0}({1}). Revisa los registros para detalles."
    ),
    AdjustGroupBlocksSuccess(
            "Adjusted bonus claim blocks for players with the {0} permission by {1}. New total: {2}.",
            "Se ajustaron los Claimblocks extra para jugadores con el permiso {0} en {1}. Nuevo total: {2}.",
            "0: permission; 1: adjustment amount; 2: new total bonus"
    ),
    InvalidPermissionID(
            "Please specify a player name, or a permission in [brackets].",
            "Por favor especifica un nombre de jugador, o un permiso entre [corchetes]."
    ),
    HowToClaimRegex(
            "(^|.*\\W)how\\W.*\\W(claim|protect|lock)(\\W.*|$)",
            "(^|.*\\W)how\\W.*\\W(claim|protect|lock)(\\W.*|$)",
            "This is a Java Regular Expression. Look it up before editing! It's used to tell players about the demo video when they ask how to claim land."
    ),
    NoBuildOutsideClaims(
            "You can't build here unless you claim some land first.",
            "No puedes construir aquí a menos que primero hagas Claim de un terreno."
    ),
    PlayerOfflineTime(
            " Last login: {0} days ago.",
            " Último inicio de sesión: hace {0} días.",
            "0: number of full days since last login"
    ),
    BuildingOutsideClaims(
            "Other players can build here, too. Consider creating a land claim to protect your work!",
            "Otros jugadores también pueden construir aquí. ¡Considera crear un Claim para proteger tu trabajo!"
    ),
    TrappedWontWorkHere(
            "Sorry, unable to find a safe location to teleport you to. Contact an admin.",
            "Lo siento, no se pudo encontrar una ubicación segura para teletransportarte. Contacta a un admin."
    ),
    CommandBannedInPvP(
            "You can't use that command while in PvP combat.",
            "No puedes usar ese comando durante combate PvP."
    ),
    NoTeleportPvPCombat(
            "You can't teleport while fighting another player.",
            "No puedes teletransportarte mientras peleas con otro jugador."
    ),
    NoTNTDamageAboveSeaLevel(
            "Warning: TNT will not destroy blocks above sea level.",
            "Advertencia: la TNT no destruirá bloques sobre el nivel del mar."
    ),
    NoTNTDamageClaims(
            "Warning: TNT will not destroy claimed blocks.",
            "Advertencia: la TNT no destruirá bloques con Claim."
    ),
    IgnoreClaimsAdvertisement(
            "To override, use /ignoreclaims.",
            "Para sobrepasar, usa /ignoreclaims."
    ),
    NoPermissionForCommand(
            "You don't have permission to do that.",
            "No tienes permiso para hacer eso."
    ),
    ClaimsListNoPermission(
            "You don't have permission to get information about another player's land claims.",
            "No tienes permiso para obtener información sobre los Claims de otro jugador."
    ),
    ExplosivesDisabled(
            "This claim is now protected from explosions. Use /claimexplosions again to disable.",
            "Este Claim ahora está protegido de explosiones. Usa /claimexplosions otra vez para desactivar."
    ),
    ExplosivesEnabled(
            "This claim is now vulnerable to explosions. Use /claimexplosions again to re-enable protections.",
            "Este Claim ahora es vulnerable a explosiones. Usa /claimexplosions otra vez para volver a activar las protecciones."
    ),
    ClaimExplosivesAdvertisement(
            "To allow explosives to destroy blocks in this land claim, use /claimexplosions.",
            "Para permitir que explosivos destruyan bloques en este Claim, usa /claimexplosions."
    ),
    PlayerInPvPSafeZone(
            "That player is in a PvP safe zone.",
            "Ese jugador está en una zona segura de PvP."
    ),
    NoPistonsOutsideClaims(
            "Warning: Pistons won't move blocks outside land claims.",
            "Advertencia: los pistones no moverán bloques fuera de los Claims."
    ),
    SoftMuted(
            "Soft-muted {0}.",
            "Soft mute aplicado a {0}.",
            "0: The changed player's name."
    ),
    UnSoftMuted(
            "Un-soft-muted {0}.",
            "Soft mute quitado a {0}.",
            "0: The changed player's name."
    ),
    DropUnlockAdvertisement(
            "Other players can't pick up your dropped items unless you /unlockdrops first.",
            "Otros jugadores no pueden recoger tus objetos tirados a menos que primero uses /unlockdrops."
    ),
    PickupBlockedExplanation(
            "You can't pick this up unless {0} uses /unlockdrops.",
            "No puedes recoger esto a menos que {0} use /unlockdrops.",
            "0: The item stack's owner."
    ),
    DropUnlockConfirmation(
            "Unlocked your drops. Other players may now pick them up (until you die again).",
            "Desbloqueaste tus drops. Otros jugadores ahora pueden recogerlos (hasta que mueras otra vez)."
    ),
    DropUnlockOthersConfirmation(
            "Unlocked {0}'s drops.",
            "Drops de {0} desbloqueados.",
            "0: The owner of the unlocked drops."
    ),
    AdvertiseACandACB(
            "You may use /acb to give yourself more claim blocks, or /adminclaims to create a free administrative claim.",
            "Puedes usar /acb para darte más Claimblocks, o /adminclaims para crear un Claim administrativo gratis."
    ),
    AdvertiseAdminClaims(
            "You could create an administrative land claim instead using /adminclaims, which you'd share with other administrators.",
            "Puedes crear un Claim administrativo usando /adminclaims, que podrás compartir con otros administradores."
    ),
    AdvertiseACB(
            "You may use /acb to give yourself more claim blocks.",
            "Puedes usar /acb para darte más Claimblocks."
    ),
    NotYourPet(
            "That belongs to {0}.",
            "Eso pertenece a {0}.",
            "0: owner name"
    ),
    AvoidGriefClaimLand(
            "Prevent grief! If you claim your land, you will be grief-proof.",
            "¡Evita el grief! Si haces Claim de tu terreno, estarás protegido."
    ),
    BecomeMayor(
            "Subdivide your land claim and become a mayor!",
            "¡Subdivide tu Claim y conviértete en alcalde!"
    ),
    ClaimCreationFailedOverClaimCountLimit(
            "You've reached your limit on land claims. Use /abandonclaim to remove one before creating another.",
            "Has alcanzado tu límite de Claims. Usa /abandonclaim para quitar uno antes de crear otro."
    ),
    CreateClaimFailOverlapRegion(
            "You can't claim all of this because you're not allowed to build here.",
            "No puedes hacer Claim de todo esto porque no tienes permiso para construir aquí."
    ),
    ResizeFailOverlapRegion(
            "You don't have permission to build there, so you can't claim that area.",
            "No tienes permiso para construir ahí, por lo tanto no puedes hacer Claim de esa área."
    ),
    ShowNearbyClaims(
            "Found {0} land claims.",
            "Se encontraron {0} Claims.",
            "0: Number of claims found."
    ),
    NoChatUntilMove(
            "Sorry, but you have to move a little more before you can chat. We get lots of spam bots here. :)",
            "Lo siento, pero debes moverte un poco más antes de chatear. Recibimos muchos bots de spam aquí. :)"
    ),
    SetClaimBlocksSuccess(
            "Updated accrued claim blocks.",
            "Claimblocks acumulados actualizados."
    ),
    IgnoreConfirmation(
            "You're now ignoring chat messages from that player.",
            "Ahora estás ignorando los mensajes de chat de ese jugador."
    ),
    UnIgnoreConfirmation(
            "You're no longer ignoring chat messages from that player.",
            "Ya no estás ignorando los mensajes de chat de ese jugador."
    ),
    NotIgnoringPlayer(
            "You're not ignoring that player.",
            "No estás ignorando a ese jugador."
    ),
    SeparateConfirmation(
            "Those players will now ignore each other in chat.",
            "Esos jugadores ahora se ignorarán mutuamente en el chat."
    ),
    UnSeparateConfirmation(
            "Those players will no longer ignore each other in chat.",
            "Esos jugadores ya no se ignorarán mutuamente en el chat."
    ),
    NotIgnoringAnyone(
            "You're not ignoring anyone.",
            "No estás ignorando a nadie."
    ),
    TrustListHeader(
            "Explicit permissions here:",
            "Permisos explícitos aquí:",
            "0: The claim's owner"
    ),
    Manage(
            "Manage",
            "Gestionar"
    ),
    Build(
            "Build",
            "Construir"
    ),
    Containers(
            "Containers",
            "Contenedores"
    ),
    Access(
            "Access",
            "Acceso"
    ),
    HasSubclaimRestriction(
            "This subclaim does not inherit permissions from the parent",
            "Esta subclaim no hereda permisos del padre"
    ),
    StartBlockMath(
            "{0} blocks from play + {1} bonus = {2} total.",
            "{0} bloques por juego + {1} bonus = {2} total."
    ),
    ClaimsListHeader(
            "Claims:",
            "Claims:"
    ),
    ContinueBlockMath(
            " (-{0} blocks)",
            " (-{0} bloques)"
    ),
    EndBlockMath(
            " = {0} blocks left to spend",
            " = {0} bloques restantes por gastar"
    ),
    NoClaimDuringPvP(
            "You can't claim lands during PvP combat.",
            "No puedes hacer Claim de terrenos durante combate PvP."
    ),
    UntrustAllOwnerOnly(
            "Only the claim owner can clear all its permissions.",
            "Solo el dueño del Claim puede limpiar todos sus permisos."
    ),
    ManagersDontUntrustManagers(
            "Only the claim owner can demote a manager.",
            "Solo el dueño del Claim puede degradar a un manager."
    ),
    PlayerNotIgnorable(
            "You can't ignore that player.",
            "No puedes ignorar a ese jugador."
    ),
    NoEnoughBlocksForChestClaim(
            "Because you don't have any claim blocks available, no automatic land claim was created for you. You can use /claimslist to monitor your available claim block total.",
            "Como no tienes Claimblocks disponibles, no se creó un Claim automático para ti. Puedes usar /claimslist para ver tu total de Claimblocks disponibles."
    ),
    MustHoldModificationToolForThat(
            "You must be holding a golden shovel to do that.",
            "Debes tener una pala dorada en la mano para hacer eso."
    ),
    StandInClaimToResize(
            "Stand inside the land claim you want to resize.",
            "Ponte dentro del Claim que quieres redimensionar."
    ),
    ClaimsExtendToSky(
            "Land claims always extend to max build height.",
            "Los Claims siempre se extienden hasta la altura máxima de construcción."
    ),
    ClaimsAutoExtendDownward(
            "Land claims auto-extend deeper into the ground when you place blocks under them.",
            "Los Claims se extienden automáticamente más profundo cuando colocas bloques debajo de ellos."
    ),
    MinimumRadius(
            "Minimum radius is {0}.",
            "El radio mínimo es {0}.",
            "0: minimum radius"
    ),
    RadiusRequiresGoldenShovel(
            "You must be holding a golden shovel when specifying a radius.",
            "Debes tener una pala dorada en la mano al especificar un radio."
    ),
    ClaimTooSmallForActiveBlocks(
            "This claim isn't big enough to support any active block types (hoppers, spawners, beacons...). Make the claim bigger first.",
            "Este Claim no es lo suficientemente grande para soportar bloques activos (tolvas, spawners, beacons...). Haz el Claim más grande primero."
    ),
    TooManyActiveBlocksInClaim(
            "This claim is at its limit for active block types (hoppers, spawners, beacons...). Either make it bigger, or remove other active blocks first.",
            "Este Claim está en su límite de bloques activos (tolvas, spawners, beacons...). Hazlo más grande o elimina algunos bloques activos primero."
    ),
    BookAuthor(
            "BigScary",
            "BigScary"
    ),
    BookTitle(
            "How to Claim Land",
            "Cómo hacer Claim de Terreno"
    ),
    BookLink(
            "Click: {0}",
            "Clic: {0}",
            "{0}: video URL"
    ),
    BookIntro(
            "Claim land to protect your stuff! Click the link above to learn land claims in 3 minutes or less. :)",
            "¡Haz Claim de terreno para proteger tus cosas! Haz clic en el enlace de arriba para aprender sobre Claims en 3 minutos o menos. :)"
    ),
    BookTools(
            "Our claim tools are {0} and {1}.",
            "Nuestras herramientas de Claim son {0} y {1}.",
            "0: claim modification tool name; 1:claim information tool name"
    ),
    BookDisabledChestClaims(
            " On this server, placing a chest will NOT claim land for you.",
            " En este servidor, colocar un cofre NO hará Claim de terreno por ti."
    ),
    BookUsefulCommands(
            "Useful Commands:",
            "Comandos útiles:"
    ),
    NoProfanity(
            "Please moderate your language.",
            "Por favor modera tu lenguaje."
    ),
    IsIgnoringYou(
            "That player is ignoring you.",
            "Ese jugador te está ignorando."
    ),
    ConsoleOnlyCommand(
            "That command may only be executed from the server console.",
            "Ese comando solo puede ejecutarse desde la consola del servidor."
    ),
    WorldNotFound(
            "World not found.",
            "Mundo no encontrado."
    ),
    TooMuchIpOverlap(
            "Sorry, there are too many players logged in with your IP address.",
            "Lo siento, hay demasiados jugadores conectados con tu dirección IP."
    ),
    StandInSubclaim(
            "You need to be standing in a subclaim to restrict it",
            "Debes estar en una subclaim para restringirla"
    ),
    SubclaimRestricted(
            "This subclaim's permissions will no longer inherit from the parent",
            "Los permisos de esta subclaim ya no heredarán del padre"
    ),
    SubclaimUnrestricted(
            "This subclaim's permissions will now inherit from the parent",
            "Los permisos de esta subclaim ahora heredarán del padre"
    ),
    NetherPortalTrapDetectionMessage(
            "It seems you might be stuck inside a nether portal. We will rescue you in a few seconds if that is the case!",
            "Parece que podrías estar atrapado dentro de un portal del Nether. ¡Te rescataremos en unos segundos si es el caso!",
            "Sent to player on join, if they left while inside a nether portal."
    );

    public final @NotNull String en;
    public final @NotNull String es;
    public final @Nullable String notes;

    Messages(@NotNull String en, @NotNull String es, @NotNull String notes) {
        this.en = en;
        this.es = es;
        this.notes = notes;
    }

    Messages(@NotNull String en, @NotNull String es) {
        this.en = en;
        this.es = es;
        this.notes = null;
    }
}
